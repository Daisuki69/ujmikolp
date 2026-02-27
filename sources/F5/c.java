package f5;

import androidx.lifecycle.Observer;
import bj.InterfaceC1031b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC1791f;
import o5.C1963b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Observer, InterfaceC1791f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16711b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f16710a = i;
        this.f16711b = function1;
    }

    public final boolean equals(Object obj) {
        switch (this.f16710a) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof InterfaceC1791f)) {
                    return ((C7.f) this.f16711b).equals(((InterfaceC1791f) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof InterfaceC1791f)) {
                    return ((C7.f) this.f16711b).equals(((InterfaceC1791f) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof Observer) && (obj instanceof InterfaceC1791f)) {
                    return ((C7.f) this.f16711b).equals(((InterfaceC1791f) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof InterfaceC1791f)) {
                    return ((C1963b) this.f16711b).equals(((InterfaceC1791f) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.InterfaceC1791f
    public final InterfaceC1031b getFunctionDelegate() {
        switch (this.f16710a) {
            case 0:
                return (C7.f) this.f16711b;
            case 1:
                return (C7.f) this.f16711b;
            case 2:
                return (C7.f) this.f16711b;
            default:
                return (C1963b) this.f16711b;
        }
    }

    public final int hashCode() {
        switch (this.f16710a) {
            case 0:
                return ((C7.f) this.f16711b).hashCode();
            case 1:
                return ((C7.f) this.f16711b).hashCode();
            case 2:
                return ((C7.f) this.f16711b).hashCode();
            default:
                return ((C1963b) this.f16711b).hashCode();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f16710a) {
            case 0:
                ((C7.f) this.f16711b).invoke(obj);
                break;
            case 1:
                ((C7.f) this.f16711b).invoke(obj);
                break;
            case 2:
                ((C7.f) this.f16711b).invoke(obj);
                break;
            default:
                ((C1963b) this.f16711b).invoke(obj);
                break;
        }
    }
}
