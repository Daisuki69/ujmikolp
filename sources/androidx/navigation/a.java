package androidx.navigation;

import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.internal.j;
import m5.C1852f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8157b;

    public /* synthetic */ a(Object obj, int i) {
        this.f8156a = i;
        this.f8157b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f8156a) {
            case 0:
                NavController.m105lifecycleObserver$lambda2((NavController) this.f8157b, lifecycleOwner, event);
                break;
            case 1:
                DialogFragmentNavigator.m119observer$lambda3((DialogFragmentNavigator) this.f8157b, lifecycleOwner, event);
                break;
            case 2:
                SavedStateRegistry.performAttach$lambda$4((SavedStateRegistry) this.f8157b, lifecycleOwner, event);
                break;
            default:
                j.g(lifecycleOwner, "<unused var>");
                j.g(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    C1852f c1852f = (C1852f) this.f8157b;
                    AlertDialog alertDialog = c1852f.c;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    c1852f.c = null;
                }
                break;
        }
    }
}
