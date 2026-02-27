package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.android.agent.util.Utility;
import java.util.NoSuchElementException;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionThreadLocal {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ActionThreadLocal");
    private static final ThreadLocal<Vector<DTXActionImpl>> tlVector = new ThreadLocal<Vector<DTXActionImpl>>() { // from class: com.dynatrace.android.agent.ActionThreadLocal.1
        @Override // java.lang.ThreadLocal
        public Vector<DTXActionImpl> initialValue() {
            return new Vector<>();
        }
    };

    public static final boolean addAction(DTXActionImpl dTXActionImpl) {
        trim();
        if (dTXActionImpl == null || dTXActionImpl.isFinalized()) {
            return false;
        }
        return tlVector.get().add(dTXActionImpl);
    }

    public static final synchronized void closeAll() {
        Vector vector;
        try {
            ThreadLocal<Vector<DTXActionImpl>> threadLocal = tlVector;
            synchronized (threadLocal) {
                vector = new Vector(threadLocal.get());
            }
            for (int i = 0; i < vector.size(); i++) {
                DTXActionImpl dTXActionImpl = (DTXActionImpl) vector.get(i);
                if (dTXActionImpl != null && !dTXActionImpl.isFinalized()) {
                    dTXActionImpl.leaveAction();
                }
            }
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogD(LOGTAG, "Expected exception? It depends on what you expect!", e);
            }
        }
    }

    public static final DTXActionImpl getCurrentAction() {
        trim();
        try {
            return tlVector.get().lastElement();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public static final boolean removeAction(DTXActionImpl dTXActionImpl) {
        boolean zRemove = tlVector.get().remove(dTXActionImpl);
        trim();
        return zRemove;
    }

    public static final synchronized void trim() {
        try {
            Vector vector = new Vector(tlVector.get());
            for (int i = 0; i < vector.size(); i++) {
                try {
                    ThreadLocal<Vector<DTXActionImpl>> threadLocal = tlVector;
                    DTXActionImpl dTXActionImpl = threadLocal.get().get(i);
                    if (dTXActionImpl != null && dTXActionImpl.isFinalized()) {
                        threadLocal.get().remove(dTXActionImpl);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            vector.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
