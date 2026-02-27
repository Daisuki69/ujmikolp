package dOYHB6.iY9fr2;

import android.content.Context;
import android.view.WindowManager;
import dOYHB6.cYHhs8;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public class mrTaD6 {
    private static boolean mHookInstalled = false;
    private static final Object mLock = new Object();

    private static class pYXZi7 implements InvocationHandler {
        private Object mOrig;

        pYXZi7(Object obj) {
            this.mOrig = obj;
        }

        private static String cuj9t7() {
            return numX49.tnTj78("bFSd");
        }

        private static String gKeST2() {
            return numX49.tnTj78("bFSi");
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z4;
            if (method.getName().equals(cuj9t7()) || method.getName().equals(gKeST2())) {
                boolean z5 = false;
                try {
                    if (objArr.length >= 3) {
                        z4 = false;
                        int i = 1;
                        while (true) {
                            if (i > 2) {
                                break;
                            }
                            try {
                                if (objArr[i] == null) {
                                    z4 = true;
                                } else if (objArr[i] instanceof WindowManager.LayoutParams) {
                                    try {
                                        ((WindowManager.LayoutParams) objArr[i]).flags |= 8192;
                                        z5 = true;
                                        break;
                                    } catch (Exception e) {
                                        z5 = true;
                                    }
                                }
                                i++;
                            } catch (Exception e7) {
                            }
                        }
                    } else {
                        z4 = false;
                    }
                } catch (Exception e10) {
                    z4 = false;
                }
                if (!z5 && (method.getName().equals(cuj9t7()) || !z4)) {
                    fChUQ4.jYu024(numX49.tnTj78("bFSE") + method.getName());
                }
            }
            return method.invoke(this.mOrig, objArr);
        }
    }

    private static boolean dE16O7(Context context) {
        Object field;
        Method methodBqTqr1;
        Object objInvoke;
        Field fieldEMD8C8;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Field fieldEMD8C82 = cYHhs8.eMD8C8(windowManager, "mGlobal");
            if (fieldEMD8C82 == null || (field = cYHhs8.getField(windowManager, fieldEMD8C82)) == null || (methodBqTqr1 = cYHhs8.bqTqr1(field, "getWindowSession", new Class[0])) == null || (objInvoke = methodBqTqr1.invoke(field, new Object[0])) == null || (fieldEMD8C8 = cYHhs8.eMD8C8(field, "sWindowSession")) == null) {
                return false;
            }
            return cYHhs8.setField(field, fieldEMD8C8, lMWAv4(objInvoke));
        } catch (Exception e) {
            return false;
        }
    }

    public static void init(Context context) {
        if (fChUQ4.ed23D0(numX49.tnTj78("bFSH"))) {
            synchronized (mLock) {
                if (mHookInstalled) {
                    return;
                }
                mHookInstalled = dE16O7(context);
                if (mHookInstalled) {
                    return;
                }
                fChUQ4.jYu024(numX49.tnTj78("bFSO"));
            }
        }
    }

    private static Object lMWAv4(Object obj) throws ClassNotFoundException {
        Class<?> cls = Class.forName(numX49.tnTj78("bFSF"));
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new pYXZi7(obj));
    }
}
