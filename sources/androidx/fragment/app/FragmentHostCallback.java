package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    private final Activity activity;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i;
        this.fragmentManager = new FragmentManagerImpl();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Activity getActivity() {
        return this.activity;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Handler getHandler() {
        return this.handler;
    }

    public void onDump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        kotlin.jvm.internal.j.g(prefix, "prefix");
        kotlin.jvm.internal.j.g(writer, "writer");
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View onFindViewById(int i) {
        return null;
    }

    public abstract H onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        kotlin.jvm.internal.j.f(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public int onGetWindowAnimations() {
        return this.windowAnimations;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    public void onRequestPermissionsFromFragment(Fragment fragment, String[] permissions, int i) {
        kotlin.jvm.internal.j.g(fragment, "fragment");
        kotlin.jvm.internal.j.g(permissions, "permissions");
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        kotlin.jvm.internal.j.g(fragment, "fragment");
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String permission) {
        kotlin.jvm.internal.j.g(permission, "permission");
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i) {
        kotlin.jvm.internal.j.g(fragment, "fragment");
        kotlin.jvm.internal.j.g(intent, "intent");
        onStartActivityFromFragment(fragment, intent, i, null);
    }

    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intent, int i, Intent intent2, int i4, int i6, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.j.g(fragment, "fragment");
        kotlin.jvm.internal.j.g(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(activity, intent, i, intent2, i4, i6, i10, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.j.g(fragment, "fragment");
        kotlin.jvm.internal.j.g(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.context, intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        kotlin.jvm.internal.j.g(activity, "activity");
    }
}
