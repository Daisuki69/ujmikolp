package androidx.navigation;

import Ej.O;
import Ej.Q;
import Ej.W;
import Ej.f0;
import Ej.h0;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import cj.C1110A;
import cj.C1112C;
import cj.C1114E;
import cj.L;
import cj.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigatorState {
    private final O _backStack;
    private final O _transitionsInProgress;
    private final f0 backStack;
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean isNavigating;
    private final f0 transitionsInProgress;

    public NavigatorState() {
        h0 h0VarB = W.b(C1112C.f9377a);
        this._backStack = h0VarB;
        h0 h0VarB2 = W.b(C1114E.f9379a);
        this._transitionsInProgress = h0VarB2;
        this.backStack = new Q(h0VarB);
        this.transitionsInProgress = new Q(h0VarB2);
    }

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final f0 getBackStack() {
        return this.backStack;
    }

    public final f0 getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(NavBackStackEntry entry) {
        j.g(entry, "entry");
        O o8 = this._transitionsInProgress;
        Set set = (Set) ((h0) o8).getValue();
        j.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.b(set.size()));
        boolean z4 = false;
        for (Object obj : set) {
            boolean z5 = true;
            if (!z4 && j.b(obj, entry)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(obj);
            }
        }
        h0 h0Var = (h0) o8;
        h0Var.getClass();
        h0Var.i(null, linkedHashSet);
    }

    @CallSuper
    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        j.g(backStackEntry, "backStackEntry");
        h0 h0Var = (h0) this._backStack;
        ArrayList arrayListM = C1110A.M(backStackEntry, C1110A.K((Iterable) h0Var.getValue(), C1110A.G((List) ((h0) this._backStack).getValue())));
        h0Var.getClass();
        h0Var.i(null, arrayListM);
    }

    public void pop(NavBackStackEntry popUpTo, boolean z4) {
        j.g(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            O o8 = this._backStack;
            Iterable iterable = (Iterable) ((h0) o8).getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (j.b((NavBackStackEntry) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            h0 h0Var = (h0) o8;
            h0Var.getClass();
            h0Var.i(null, arrayList);
            Unit unit = Unit.f18162a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void popWithTransition(NavBackStackEntry popUpTo, boolean z4) {
        Object objPrevious;
        j.g(popUpTo, "popUpTo");
        h0 h0Var = (h0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetE = S.e((Set) h0Var.getValue(), popUpTo);
        h0Var.getClass();
        h0Var.i(null, linkedHashSetE);
        List list = (List) this.backStack.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!j.b(navBackStackEntry, popUpTo) && ((List) this.backStack.getValue()).lastIndexOf(navBackStackEntry) < ((List) this.backStack.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            h0 h0Var2 = (h0) this._transitionsInProgress;
            LinkedHashSet linkedHashSetE2 = S.e((Set) h0Var2.getValue(), navBackStackEntry2);
            h0Var2.getClass();
            h0Var2.i(null, linkedHashSetE2);
        }
        pop(popUpTo, z4);
    }

    public void push(NavBackStackEntry backStackEntry) {
        j.g(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            O o8 = this._backStack;
            ArrayList arrayListM = C1110A.M(backStackEntry, (Collection) ((h0) o8).getValue());
            h0 h0Var = (h0) o8;
            h0Var.getClass();
            h0Var.i(null, arrayListM);
            Unit unit = Unit.f18162a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(NavBackStackEntry backStackEntry) {
        j.g(backStackEntry, "backStackEntry");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) C1110A.H((List) this.backStack.getValue());
        if (navBackStackEntry != null) {
            h0 h0Var = (h0) this._transitionsInProgress;
            LinkedHashSet linkedHashSetE = S.e((Set) h0Var.getValue(), navBackStackEntry);
            h0Var.getClass();
            h0Var.i(null, linkedHashSetE);
        }
        h0 h0Var2 = (h0) this._transitionsInProgress;
        LinkedHashSet linkedHashSetE2 = S.e((Set) h0Var2.getValue(), backStackEntry);
        h0Var2.getClass();
        h0Var2.i(null, linkedHashSetE2);
        push(backStackEntry);
    }

    public final void setNavigating(boolean z4) {
        this.isNavigating = z4;
    }
}
