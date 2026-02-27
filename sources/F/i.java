package F;

import D.S;
import D.b0;
import Xb.w;
import a.AbstractC0617a;
import af.C0690e;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import b5.C0910b;
import bc.o;
import c5.C1075a;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListSearchFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import dOYHB6.tiZVw8.numX49;
import df.EnumC1355A;
import java.net.ProtocolException;
import java.util.ArrayList;
import k2.v0;
import kotlin.jvm.functions.Function1;
import s5.InterfaceC2237a;
import x5.C2467a;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Ch.c, af.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1503b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1504d;

    public /* synthetic */ i(int i, byte b8) {
        this.f1502a = i;
    }

    public static i c(String str) throws ProtocolException {
        int i;
        String strTnTj78;
        boolean zStartsWith = str.startsWith(numX49.tnTj78("Pcl"));
        EnumC1355A enumC1355A = EnumC1355A.HTTP_1_0;
        String strTnTj782 = numX49.tnTj78("PcW");
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(strTnTj782.concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException(strTnTj782.concat(str));
                }
                enumC1355A = EnumC1355A.HTTP_1_1;
            }
        } else {
            if (!str.startsWith(numX49.tnTj78("PcP9"))) {
                throw new ProtocolException(strTnTj782.concat(str));
            }
            i = 4;
        }
        int i4 = i + 3;
        if (str.length() < i4) {
            throw new ProtocolException(strTnTj782.concat(str));
        }
        try {
            int i6 = Integer.parseInt(str.substring(i, i4));
            if (str.length() <= i4) {
                strTnTj78 = numX49.tnTj78("PcPP");
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException(strTnTj782.concat(str));
                }
                strTnTj78 = str.substring(i + 4);
            }
            return new i(strTnTj78, i6, 8, enumC1355A);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(strTnTj782.concat(str));
        }
    }

    public static final void f(NativeCustomFormatAd nativeCustomFormatAd, i iVar, C0910b c0910b, Context context) {
        nativeCustomFormatAd.performClick(numX49.tnTj78("PcPb"));
        Function1 function1 = (Function1) iVar.f1504d;
        if (function1 != null) {
            function1.invoke(c0910b);
        }
        C2467a c2467a = AbstractC0617a.f6973b;
        if (c2467a != null) {
            InterfaceC2237a interfaceC2237a = c0910b.f8517b;
            kotlin.jvm.internal.j.d(interfaceC2237a);
            c2467a.a(numX49.tnTj78("PcP2"), new C1075a(c0910b.f8516a, interfaceC2237a, c0910b.f8518d, c0910b.e, c0910b.f, null, null, null, null, null, null, 2016).a());
        }
        v0.p(context, c0910b);
    }

    @Override // af.h
    public void a() {
        HandlerThread handlerThread = (HandlerThread) this.f1503b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1503b = null;
            this.f1504d = null;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f1502a) {
            case 4:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, numX49.tnTj78("PcPk"));
                ((MayaShopProviderProductsListSearchFragment) ((bc.i) ((w) this.f1503b).c.get())).f14090e0 = this.c;
                ((w) this.f1503b).o((String) this.f1504d, productV3Base.getRecords());
                break;
            case 5:
                ProductV3Base productV3Base2 = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base2, numX49.tnTj78("PcPZ"));
                ((MayaShopSearchFragment) ((o) ((w) this.f1503b).c.get())).f14170i0 = this.c;
                ((w) this.f1503b).o((String) this.f1504d, productV3Base2.getRecords());
                break;
            case 10:
                ProductV3Base productV3Base3 = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base3, numX49.tnTj78("PcPr"));
                ((ShopV3ProviderProductsListSearchFragment) ((ve.g) ((w) this.f1503b).c.get())).f14848d0 = this.c;
                ((w) this.f1503b).o((String) this.f1504d, productV3Base3.getRecords());
                break;
            default:
                ProductV3Base productV3Base4 = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base4, numX49.tnTj78("PcPL"));
                ((ShopV3SearchFragment) ((ve.m) ((w) this.f1503b).c.get())).f14889e0 = this.c;
                ((w) this.f1503b).o((String) this.f1504d, productV3Base4.getRecords());
                break;
        }
    }

    @Override // af.h
    public void b(C0690e c0690e, Runnable runnable) {
        ((Handler) this.f1504d).post(runnable);
    }

    public L1.a d() {
        boolean z4 = true;
        if (!zzcu.zza(true) && !((ArrayList) this.f1504d).contains(zzcm.zza((Context) this.f1503b))) {
            z4 = false;
        }
        return new L1.a(z4, this);
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("PcPB"));
        int i = this.c + 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = ((Object[]) this.f1503b)[i4];
            if (obj instanceof Rj.d) {
                Rj.d dVar = (Rj.d) obj;
                if (!kotlin.jvm.internal.j.b(dVar.getKind(), Rj.i.f5572d)) {
                    int i6 = ((int[]) this.f1504d)[i4];
                    if (i6 >= 0) {
                        sb2.append(numX49.tnTj78("PcPS"));
                        sb2.append(dVar.e(i6));
                    }
                } else if (((int[]) this.f1504d)[i4] != -1) {
                    sb2.append(numX49.tnTj78("PcPu"));
                    sb2.append(((int[]) this.f1504d)[i4]);
                    sb2.append(numX49.tnTj78("PcPV"));
                }
            } else if (obj != Vj.g.f6142a) {
                sb2.append(numX49.tnTj78("PcPj"));
                sb2.append(obj);
                sb2.append(numX49.tnTj78("PcPd"));
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    public void g(boolean z4) {
        this.c = z4 ? 0 : this.c + 1;
        String str = numX49.tnTj78("PcPi") + this.c;
        String str2 = (String) this.f1504d;
        S.m(str2, str);
        b0.k((Context) this.f1503b, this.c, b0.o(str2, numX49.tnTj78("PcPE")));
    }

    @Override // af.h
    public void start() {
        HandlerThread handlerThread = new HandlerThread(numX49.tnTj78("PcPF"), this.c);
        this.f1503b = handlerThread;
        handlerThread.start();
        this.f1504d = new Handler(((HandlerThread) this.f1503b).getLooper());
    }

    public String toString() {
        switch (this.f1502a) {
            case 3:
                return e();
            case 8:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((EnumC1355A) this.f1503b) == EnumC1355A.HTTP_1_0 ? numX49.tnTj78("PcPH") : numX49.tnTj78("PcPO"));
                sb2.append(' ');
                sb2.append(this.c);
                String str = (String) this.f1504d;
                if (str != null) {
                    sb2.append(' ');
                    sb2.append(str);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(String str, int i, int i4, Object obj) {
        this.f1502a = i4;
        this.f1503b = obj;
        this.c = i;
        this.f1504d = str;
    }

    public i(Context context) {
        this.f1502a = 1;
        this.f1504d = new ArrayList();
        this.c = 0;
        this.f1503b = context.getApplicationContext();
    }

    public i(Float f, com.squareup.wire.internal.a aVar, Function1 function1) {
        this.f1502a = 7;
        this.f1503b = f;
        this.f1504d = function1;
    }

    public i(Context context, String str) {
        this.f1502a = 0;
        kotlin.jvm.internal.j.g(context, numX49.tnTj78("Pcz"));
        this.f1503b = context;
        this.f1504d = str;
    }

    public i(int i) {
        this.f1502a = 6;
        this.c = i;
    }
}
