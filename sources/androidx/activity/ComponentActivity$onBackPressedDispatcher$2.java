package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends kotlin.jvm.internal.k implements Function0<OnBackPressedDispatcher> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ComponentActivity componentActivity) {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!kotlin.jvm.internal.j.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e7) {
            if (!kotlin.jvm.internal.j.b(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e7;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final OnBackPressedDispatcher invoke() {
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new f(this.this$0, 0));
        final ComponentActivity componentActivity = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!kotlin.jvm.internal.j.b(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.access$addObserverForBackInvoker(componentActivity, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }
}
