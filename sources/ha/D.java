package ha;

import android.os.Handler;
import android.os.Looper;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f16977b;
    public final /* synthetic */ MayaInputLayout c;

    public /* synthetic */ D(Function0 function0, MayaInputLayout mayaInputLayout, int i) {
        this.f16976a = i;
        this.f16977b = function0;
        this.c = mayaInputLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16976a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final Function0 function0 = this.f16977b;
                    final MayaInputLayout mayaInputLayout = this.c;
                    final int i = 0;
                    handler.postDelayed(new Runnable() { // from class: ha.G
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    Function0 function02 = function0;
                                    if (function02 != null) {
                                        function02.invoke();
                                    }
                                    mayaInputLayout.d();
                                    break;
                                case 1:
                                    Function0 function03 = function0;
                                    if (function03 != null) {
                                        function03.invoke();
                                    }
                                    mayaInputLayout.d();
                                    break;
                                case 2:
                                    Function0 function04 = function0;
                                    if (function04 != null) {
                                        function04.invoke();
                                    }
                                    mayaInputLayout.d();
                                    break;
                                default:
                                    Function0 function05 = function0;
                                    if (function05 != null) {
                                        function05.invoke();
                                    }
                                    mayaInputLayout.d();
                                    break;
                            }
                        }
                    }, 500L);
                }
                break;
            case 1:
                kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHb"));
                Handler handler2 = new Handler(Looper.getMainLooper());
                final Function0 function02 = this.f16977b;
                final MayaInputLayout mayaInputLayout2 = this.c;
                final int i4 = 1;
                handler2.postDelayed(new Runnable() { // from class: ha.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                Function0 function022 = function02;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                mayaInputLayout2.d();
                                break;
                            case 1:
                                Function0 function03 = function02;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                mayaInputLayout2.d();
                                break;
                            case 2:
                                Function0 function04 = function02;
                                if (function04 != null) {
                                    function04.invoke();
                                }
                                mayaInputLayout2.d();
                                break;
                            default:
                                Function0 function05 = function02;
                                if (function05 != null) {
                                    function05.invoke();
                                }
                                mayaInputLayout2.d();
                                break;
                        }
                    }
                }, 500L);
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    Handler handler3 = new Handler(Looper.getMainLooper());
                    final Function0 function03 = this.f16977b;
                    final MayaInputLayout mayaInputLayout3 = this.c;
                    final int i6 = 2;
                    handler3.postDelayed(new Runnable() { // from class: ha.G
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    Function0 function022 = function03;
                                    if (function022 != null) {
                                        function022.invoke();
                                    }
                                    mayaInputLayout3.d();
                                    break;
                                case 1:
                                    Function0 function032 = function03;
                                    if (function032 != null) {
                                        function032.invoke();
                                    }
                                    mayaInputLayout3.d();
                                    break;
                                case 2:
                                    Function0 function04 = function03;
                                    if (function04 != null) {
                                        function04.invoke();
                                    }
                                    mayaInputLayout3.d();
                                    break;
                                default:
                                    Function0 function05 = function03;
                                    if (function05 != null) {
                                        function05.invoke();
                                    }
                                    mayaInputLayout3.d();
                                    break;
                            }
                        }
                    }, 500L);
                }
                break;
            default:
                kotlin.jvm.internal.j.g((Unit) obj, numX49.tnTj78("bSHP"));
                Handler handler4 = new Handler(Looper.getMainLooper());
                final Function0 function04 = this.f16977b;
                final MayaInputLayout mayaInputLayout4 = this.c;
                final int i10 = 3;
                handler4.postDelayed(new Runnable() { // from class: ha.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Function0 function022 = function04;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                mayaInputLayout4.d();
                                break;
                            case 1:
                                Function0 function032 = function04;
                                if (function032 != null) {
                                    function032.invoke();
                                }
                                mayaInputLayout4.d();
                                break;
                            case 2:
                                Function0 function042 = function04;
                                if (function042 != null) {
                                    function042.invoke();
                                }
                                mayaInputLayout4.d();
                                break;
                            default:
                                Function0 function05 = function04;
                                if (function05 != null) {
                                    function05.invoke();
                                }
                                mayaInputLayout4.d();
                                break;
                        }
                    }
                }, 500L);
                break;
        }
        return Unit.f18162a;
    }
}
