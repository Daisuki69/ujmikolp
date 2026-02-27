package dOYHB6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class nm8AQ4 {
    private static volatile Context sContext;
    private static final List<oyJjL8> contextSetCallbackList = new ArrayList();
    private static final ReentrantLock contextLock = new ReentrantLock();

    public static Context get() {
        return sContext;
    }

    public static void set(Context context) {
        contextLock.lock();
        if (sContext != null) {
            contextLock.unlock();
            return;
        }
        if (context == null) {
            contextLock.unlock();
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            sContext = context;
        } else {
            sContext = applicationContext;
        }
        contextLock.unlock();
        tSgKJ9();
    }

    public static void syG0J1(oyJjL8 oyjjl8) {
        if (oyjjl8 == null) {
            return;
        }
        contextLock.lock();
        if (sContext != null) {
            contextLock.unlock();
            oyjjl8.onContextSet();
        } else {
            contextSetCallbackList.add(oyjjl8);
            contextLock.unlock();
        }
    }

    private static void tSgKJ9() {
        Iterator<oyJjL8> it = contextSetCallbackList.iterator();
        while (it.hasNext()) {
            it.next().onContextSet();
        }
        contextSetCallbackList.clear();
    }
}
