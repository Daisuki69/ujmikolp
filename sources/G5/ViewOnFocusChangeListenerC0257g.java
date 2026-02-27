package G5;

import android.view.View;
import bj.InterfaceC1031b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: G5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0257g implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1744b;
    public final /* synthetic */ InterfaceC1031b c;

    public /* synthetic */ ViewOnFocusChangeListenerC0257g(Object obj, InterfaceC1031b interfaceC1031b, int i) {
        this.f1743a = i;
        this.f1744b = obj;
        this.c = interfaceC1031b;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f1743a) {
            case 0:
                if (!z4) {
                    ((C0256f) this.f1744b).a();
                    Function0 function0 = (Function0) this.c;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                break;
            case 1:
                if (!z4) {
                    Function1 function1 = (Function1) this.c;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(z4));
                    }
                } else {
                    Function1 function12 = (Function1) this.f1744b;
                    if (function12 != null) {
                        function12.invoke(Boolean.valueOf(z4));
                    }
                }
                break;
            default:
                if (!z4) {
                    ((Function0) this.f1744b).invoke();
                } else {
                    ((Function0) this.c).invoke();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnFocusChangeListenerC0257g(Function0 function0, Function0 function02) {
        this.f1743a = 2;
        this.c = function0;
        this.f1744b = function02;
    }
}
