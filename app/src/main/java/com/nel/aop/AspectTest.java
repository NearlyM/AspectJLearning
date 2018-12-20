package com.nel.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Description :
 * CreateTime : 2018/12/20 15:33
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */
@Aspect
public class AspectTest {

    public static final String TAG = AspectTest.class.getSimpleName();

    @Before("execution(* *..MainActivity+.on**(..))")
    public void method(JoinPoint point) {
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        String simpleName = point.getThis().getClass().getSimpleName();
        Log.e(TAG, "class:" + simpleName);
        Log.e(TAG, "method:" + methodSignature.getName());
    }
}
