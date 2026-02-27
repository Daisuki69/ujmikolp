package dOYHB6.oCnbV3;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dOYHB6.cYHhs8;
import dOYHB6.fVtPr9.f2Ela7;
import dOYHB6.lPFdA1;
import dOYHB6.nm8AQ4;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.uXNAP0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class d3TV41 {
    private static final int MSG_BIND = 2;
    private static final int MSG_SET_ACTIVE = 4;
    private static final int MSG_SET_USER_ACTION_NOTIFICATION_SEQUENCE_NUMBER = 9;
    private static Method finishInputLockedMethod;
    private static final boolean isSystemKeyboardsDisabled = Boolean.valueOf(numX49.tnTj78("bFrB")).booleanValue();
    private static final Set<String> KeyboardWhiteList = new HashSet(Arrays.asList(new String[0]));
    private static g1yOm6 guardThread = null;
    private static final Object guardThreadLock = new Object();

    static class g1yOm6 extends Thread {
        private static final int maxSleepTime = 1000;
        private static final int minSleepTime = 300;
        private volatile boolean stop = false;
        private volatile boolean finished = false;

        g1yOm6() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String nihpJ1(InputMethodManager inputMethodManager) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField("mCurId");
                declaredField.setAccessible(true);
                String str = (String) declaredField.get(inputMethodManager);
                declaredField.setAccessible(false);
                return str == null ? rINvT3() : str;
            } catch (Exception e) {
                cYHhs8.gWQKs2(e, false);
                return rINvT3();
            }
        }

        private static String rINvT3() {
            return Settings.Secure.getString(iKNpI8.jqldq5().getContentResolver(), numX49.tnTj78("bFrZ"));
        }

        synchronized boolean isFinished() {
            return this.finished;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String strTnTj78 = numX49.tnTj78("bFrk");
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) iKNpI8.jqldq5().getSystemService(strTnTj78);
                String strNihpJ1 = nihpJ1(inputMethodManager);
                while (d3TV41.jqdHm6(strNihpJ1) && !this.stop) {
                    d3TV41.finishInputLockedMethod.setAccessible(true);
                    d3TV41.finishInputLockedMethod.invoke(inputMethodManager, new Object[0]);
                    d3TV41.finishInputLockedMethod.setAccessible(false);
                    Thread.sleep(new Random().nextInt(TypedValues.TransitionType.TYPE_DURATION) + 300);
                    inputMethodManager = (InputMethodManager) iKNpI8.jqldq5().getSystemService(strTnTj78);
                    strNihpJ1 = nihpJ1(inputMethodManager);
                }
                this.finished = true;
            } catch (IllegalAccessException e) {
                e = e;
                cYHhs8.gWQKs2(e, false);
            } catch (InterruptedException e7) {
                cYHhs8.gWQKs2(e7, false);
                Thread.currentThread().interrupt();
            } catch (InvocationTargetException e10) {
                e = e10;
                cYHhs8.gWQKs2(e, false);
            }
        }

        synchronized void stopThread() {
            this.stop = true;
        }
    }

    static class kErSV4 implements Handler.Callback {
        kErSV4() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            InputMethodManager inputMethodManager = (InputMethodManager) iKNpI8.jqldq5().getSystemService(numX49.tnTj78("bFrP"));
            String strNihpJ1 = g1yOm6.nihpJ1(inputMethodManager);
            if ((message.what == 4 || message.what == 9) && !d3TV41.jqdHm6(strNihpJ1)) {
                synchronized (d3TV41.guardThreadLock) {
                    if (d3TV41.guardThread != null) {
                        while (!d3TV41.guardThread.isFinished()) {
                            d3TV41.guardThread.stopThread();
                        }
                        d3TV41.guardThread = null;
                    }
                }
            }
            synchronized (d3TV41.guardThreadLock) {
                if (d3TV41.guardThread != null && d3TV41.guardThread.isFinished()) {
                    d3TV41.guardThread = null;
                }
            }
            if (message.what == 2) {
                boolean zJqdHm6 = d3TV41.jqdHm6(strNihpJ1);
                if (zJqdHm6 && fChUQ4.ed23D0(numX49.tnTj78("bFrb"))) {
                    synchronized (d3TV41.guardThreadLock) {
                        if (d3TV41.guardThread == null) {
                            d3TV41.guardThread = new g1yOm6();
                            d3TV41.guardThread.start();
                        }
                    }
                    inputMethodManager.showInputMethodPicker();
                }
                if (zJqdHm6) {
                    fChUQ4.zJGTn5(numX49.tnTj78("bFr2"), numX49.tnTj78("bFrL"), uXNAP0.bool(zJqdHm6), numX49.tnTj78("bFrr"), strNihpJ1);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean jqdHm6(String str) {
        if (lPFdA1.isNullOrEmpty(str)) {
            return false;
        }
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
        String packageName = componentNameUnflattenFromString != null ? componentNameUnflattenFromString.getPackageName() : null;
        if (KeyboardWhiteList.contains(str) || KeyboardWhiteList.contains(packageName)) {
            return false;
        }
        return isSystemKeyboardsDisabled || !nP4Pg5(str, packageName);
    }

    private static boolean nP4Pg5(String str, String str2) {
        if (lPFdA1.isNullOrEmpty(str)) {
            return false;
        }
        if (zExFS6().contains(str)) {
            return true;
        }
        if (!lPFdA1.isNullOrEmpty(str2)) {
            try {
                int i = nm8AQ4.get().getPackageManager().getApplicationInfo(str2, 0).flags;
                if ((i & 1) != 0 || (i & 128) != 0) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static void tqJ2n8() {
        InputMethodManager inputMethodManager = (InputMethodManager) iKNpI8.jqldq5().getSystemService(numX49.tnTj78("bFrV"));
        try {
            finishInputLockedMethod = inputMethodManager.getClass().getDeclaredMethod("finishInputLocked", new Class[0]);
            Field fieldZYg5T4 = f2Ela7.zYg5T4(inputMethodManager.getClass(), "mH");
            fieldZYg5T4.setAccessible(true);
            Handler handler = (Handler) fieldZYg5T4.get(inputMethodManager);
            synchronized (handler) {
                kErSV4 kersv4 = new kErSV4();
                Field declaredField = handler.getClass().getSuperclass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                declaredField.set(handler, kersv4);
                declaredField.setAccessible(false);
            }
            fieldZYg5T4.setAccessible(false);
        } catch (Exception e) {
            cYHhs8.gWQKs2(e, false);
        }
    }

    private static HashSet<String> zExFS6() {
        HashSet<String> hashSet = new HashSet<>(0);
        for (InputMethodInfo inputMethodInfo : ((InputMethodManager) iKNpI8.jqldq5().getSystemService(numX49.tnTj78("bFru"))).getEnabledInputMethodList()) {
            String id = inputMethodInfo.getId();
            int i = inputMethodInfo.getServiceInfo().applicationInfo.flags;
            if ((i & 1) != 0 || (i & 128) != 0) {
                hashSet.add(id);
            }
        }
        return hashSet;
    }
}
