package Q9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import defpackage.AbstractC1414e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditFragment f5303b;

    public /* synthetic */ E(NewMayaCreditFragment newMayaCreditFragment, int i) {
        this.f5302a = i;
        this.f5303b = newMayaCreditFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5302a) {
            case 0:
                NewMayaCreditFragment newMayaCreditFragment = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditFragment.a2(newMayaCreditFragment);
                    return;
                } finally {
                }
            case 1:
                NewMayaCreditFragment newMayaCreditFragment2 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = newMayaCreditFragment2.o1();
                    FragmentActivity activity = newMayaCreditFragment2.getActivity();
                    C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD.r(EnumC1216e.SUMMARY);
                    c1219hD.n(17);
                    AbstractC1414e.n(c1219hD, EnumC1217f.OUTSTANDING_BALANCE_PAY_NOW, c1220iO1, activity, c1219hD);
                    final L9.B bP1 = newMayaCreditFragment2.P1();
                    final int i = 0;
                    bP1.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i) {
                                case 0:
                                    final B b8 = bP1;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i4 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i4) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP1;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i6 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i6) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 2:
                NewMayaCreditFragment newMayaCreditFragment3 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO12 = newMayaCreditFragment3.o1();
                    FragmentActivity activity2 = newMayaCreditFragment3.getActivity();
                    C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD2.r(EnumC1216e.SUMMARY);
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.BILL_STATEMENT_VIEW);
                    c1219hD2.i();
                    c1220iO12.c(activity2, c1219hD2);
                    newMayaCreditFragment3.P1().p();
                    return;
                } finally {
                }
            case 3:
                NewMayaCreditFragment newMayaCreditFragment4 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO13 = newMayaCreditFragment4.o1();
                    FragmentActivity activity3 = newMayaCreditFragment4.getActivity();
                    C1219h c1219hD3 = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD3.r(EnumC1216e.SUMMARY);
                    c1219hD3.n(17);
                    AbstractC1414e.n(c1219hD3, EnumC1217f.BILL_PAY_NOW, c1220iO13, activity3, c1219hD3);
                    final L9.B bP12 = newMayaCreditFragment4.P1();
                    final int i4 = 1;
                    bP12.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i4) {
                                case 0:
                                    final B b8 = bP12;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP12;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i6 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i6) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 4:
                NewMayaCreditFragment newMayaCreditFragment5 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    L9.B bP13 = newMayaCreditFragment5.P1();
                    ((NewMayaCreditFragment) ((P9.k) bP13.c.get())).O1();
                    bP13.n();
                    return;
                } finally {
                }
            case 5:
                NewMayaCreditFragment newMayaCreditFragment6 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    final L9.B bP14 = newMayaCreditFragment6.P1();
                    final int i6 = 1;
                    bP14.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i6) {
                                case 0:
                                    final B b8 = bP14;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP14;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i62 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i62) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 6:
                NewMayaCreditFragment newMayaCreditFragment7 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    final L9.B bP15 = newMayaCreditFragment7.P1();
                    final int i10 = 1;
                    bP15.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i10) {
                                case 0:
                                    final B b8 = bP15;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP15;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i62 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i62) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 7:
                NewMayaCreditFragment newMayaCreditFragment8 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    final L9.B bP16 = newMayaCreditFragment8.P1();
                    final int i11 = 1;
                    bP16.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i11) {
                                case 0:
                                    final B b8 = bP16;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP16;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i62 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i62) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 8:
                NewMayaCreditFragment newMayaCreditFragment9 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditFragment.c2(newMayaCreditFragment9);
                    return;
                } finally {
                }
            case 9:
                NewMayaCreditFragment newMayaCreditFragment10 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditFragment.b2(newMayaCreditFragment10);
                    return;
                } finally {
                }
            case 10:
                NewMayaCreditFragment newMayaCreditFragment11 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO14 = newMayaCreditFragment11.o1();
                    FragmentActivity activity4 = newMayaCreditFragment11.getActivity();
                    C1219h c1219hD4 = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD4.r(EnumC1216e.SUMMARY);
                    c1219hD4.n(17);
                    c1219hD4.t(EnumC1217f.BILL_STATEMENT);
                    c1219hD4.i();
                    c1220iO14.c(activity4, c1219hD4);
                    newMayaCreditFragment11.P1().p();
                    return;
                } finally {
                }
            case 11:
                NewMayaCreditFragment newMayaCreditFragment12 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO15 = newMayaCreditFragment12.o1();
                    FragmentActivity activity5 = newMayaCreditFragment12.getActivity();
                    C1219h c1219hD5 = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD5.r(EnumC1216e.SUMMARY);
                    c1219hD5.n(17);
                    AbstractC1414e.n(c1219hD5, EnumC1217f.BILL_PAY_NOW, c1220iO15, activity5, c1219hD5);
                    final L9.B bP17 = newMayaCreditFragment12.P1();
                    final int i12 = 1;
                    bP17.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i12) {
                                case 0:
                                    final B b8 = bP17;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP17;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i62 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i62) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 12:
                NewMayaCreditFragment newMayaCreditFragment13 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO16 = newMayaCreditFragment13.o1();
                    FragmentActivity activity6 = newMayaCreditFragment13.getActivity();
                    C1219h c1219hD6 = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD6.r(EnumC1216e.SUMMARY);
                    c1219hD6.n(17);
                    AbstractC1414e.n(c1219hD6, EnumC1217f.PAY_NOW, c1220iO16, activity6, c1219hD6);
                    final L9.B bP18 = newMayaCreditFragment13.P1();
                    final int i13 = 0;
                    bP18.l(new Function1() { // from class: L9.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    final B b8 = bP18;
                                    if (((Boolean) obj).booleanValue()) {
                                        b8.A(true);
                                    } else {
                                        final int i42 = 1;
                                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i42) {
                                                    case 0:
                                                        b8.A(false);
                                                        break;
                                                    default:
                                                        b8.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                                default:
                                    final B b10 = bP18;
                                    if (((Boolean) obj).booleanValue()) {
                                        b10.A(false);
                                    } else {
                                        final int i62 = 0;
                                        ((NewMayaCreditFragment) ((P9.k) b10.c.get())).i2(new Function0() { // from class: L9.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i62) {
                                                    case 0:
                                                        b10.A(false);
                                                        break;
                                                    default:
                                                        b10.A(true);
                                                        break;
                                                }
                                                return Unit.f18162a;
                                            }
                                        });
                                    }
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    });
                    return;
                } finally {
                }
            case 13:
                NewMayaCreditFragment newMayaCreditFragment14 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditFragment.d2(newMayaCreditFragment14);
                    return;
                } finally {
                }
            default:
                NewMayaCreditFragment newMayaCreditFragment15 = this.f5303b;
                Callback.onClick_enter(view);
                try {
                    NewMayaCreditFragment.e2(newMayaCreditFragment15);
                    return;
                } finally {
                }
        }
    }
}
