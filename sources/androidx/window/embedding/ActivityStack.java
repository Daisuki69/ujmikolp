package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityStack {
    private final List<Activity> activitiesInProcess;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ActivityStack(List<? extends Activity> activitiesInProcess, boolean z4) {
        j.g(activitiesInProcess, "activitiesInProcess");
        this.activitiesInProcess = activitiesInProcess;
        this.isEmpty = z4;
    }

    public final boolean contains(Activity activity) {
        j.g(activity, "activity");
        return this.activitiesInProcess.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return j.b(this.activitiesInProcess, activityStack.activitiesInProcess) && this.isEmpty == activityStack.isEmpty;
    }

    public final List<Activity> getActivitiesInProcess$window_release() {
        return this.activitiesInProcess;
    }

    public int hashCode() {
        return (this.activitiesInProcess.hashCode() * 31) + (this.isEmpty ? 1231 : 1237);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityStack{activitiesInProcess=");
        sb2.append(this.activitiesInProcess);
        sb2.append(", isEmpty=");
        return androidx.camera.core.impl.a.q(sb2, this.isEmpty, '}');
    }
}
