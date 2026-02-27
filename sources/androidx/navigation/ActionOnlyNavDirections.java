package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;
    private final Bundle arguments = new Bundle();

    public ActionOnlyNavDirections(int i) {
        this.actionId = i;
    }

    public static /* synthetic */ ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = actionOnlyNavDirections.getActionId();
        }
        return actionOnlyNavDirections.copy(i);
    }

    public final int component1() {
        return getActionId();
    }

    public final ActionOnlyNavDirections copy(int i) {
        return new ActionOnlyNavDirections(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ActionOnlyNavDirections.class.equals(obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId();
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.navigation.NavDirections
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return getActionId() + 31;
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
