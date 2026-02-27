package androidx.window.embedding;

import android.app.Activity;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final SplitAttributes splitAttributes;
    private final IBinder token;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitInfo(ActivityStack primaryActivityStack, ActivityStack secondaryActivityStack, SplitAttributes splitAttributes, IBinder token) {
        j.g(primaryActivityStack, "primaryActivityStack");
        j.g(secondaryActivityStack, "secondaryActivityStack");
        j.g(splitAttributes, "splitAttributes");
        j.g(token, "token");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitAttributes = splitAttributes;
        this.token = token;
    }

    public final boolean contains(Activity activity) {
        j.g(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        return j.b(this.primaryActivityStack, splitInfo.primaryActivityStack) && j.b(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && j.b(this.splitAttributes, splitInfo.splitAttributes) && j.b(this.token, splitInfo.token);
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final SplitAttributes getSplitAttributes() {
        return this.splitAttributes;
    }

    public final IBinder getToken$window_release() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + ((this.splitAttributes.hashCode() + ((this.secondaryActivityStack.hashCode() + (this.primaryActivityStack.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitInfo:{");
        sb2.append("primaryActivityStack=" + this.primaryActivityStack + ", ");
        sb2.append("secondaryActivityStack=" + this.secondaryActivityStack + ", ");
        sb2.append("splitAttributes=" + this.splitAttributes + ", ");
        StringBuilder sb3 = new StringBuilder("token=");
        sb3.append(this.token);
        sb2.append(sb3.toString());
        sb2.append("}");
        String string = sb2.toString();
        j.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
