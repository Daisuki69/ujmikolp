package qc;

import We.s;
import Xb.A;
import android.os.SystemClock;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.model.UpgradePlusReference;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import o5.C1963b;
import oi.C1989g;
import pc.EnumC2032a;
import rc.C2194a;
import rc.m;
import rc.o;
import se.i;
import tc.InterfaceC2282c;
import v.AbstractC2329d;
import v3.AbstractC2338a;
import w4.C2377a;
import w4.C2378b;
import w4.C2379c;
import wc.InterfaceC2394e;
import wc.f;
import we.InterfaceC2407L;
import xc.InterfaceC2469a;
import ya.C2516a;
import yd.k;
import zd.r;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Ch.c, zzwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19770b;

    public /* synthetic */ c(Object obj, int i) {
        this.f19769a = i;
        this.f19770b = obj;
    }

    public static void a(byte b8, byte b10, int i, long j) throws C2378b {
        if (b8 == 3) {
            throw new C2378b("unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new C2378b(s.f(b10, "untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new C2378b(s.f(i, "untrusted stratum: "));
        }
        if (j == 0) {
            throw new C2378b("zero transmitTime");
        }
    }

    public static long d(byte[] bArr, int i) {
        int i4 = bArr[i];
        int i6 = bArr[i + 1];
        int i10 = bArr[i + 2];
        int i11 = bArr[i + 3];
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (((long) i4) << 24) + (((long) i6) << 16) + (((long) i10) << 8) + ((long) i11);
    }

    public static long e(int i, byte[] bArr) {
        long jD = d(bArr, i);
        return ((d(bArr, i + 4) * 1000) / 4294967296L) + ((jD - 2208988800L) * 1000);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        final int i = 0;
        final int i4 = 1;
        switch (this.f19769a) {
            case 0:
                Throwable throwable = (Throwable) obj;
                j.g(throwable, "throwable");
                d dVar = (d) this.f19770b;
                PayMayaError payMayaErrorF = dVar.f(throwable, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                dVar.n(payMayaErrorF, 4, true);
                break;
            case 1:
                Throwable throwable2 = (Throwable) obj;
                j.g(throwable2, "throwable");
                C2194a c2194a = (C2194a) this.f19770b;
                PayMayaError payMayaErrorF2 = c2194a.f(throwable2, true);
                j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                C1963b c1963b = new C1963b(2, c2194a, payMayaErrorF2);
                c2194a.getClass();
                int iMErrorCode = payMayaErrorF2.mErrorCode();
                if (iMErrorCode != 30100) {
                    c1963b.invoke(Integer.valueOf(iMErrorCode));
                } else {
                    c2194a.f19771d.r0(true);
                    c2194a.f19772g = true;
                    InterfaceC2282c interfaceC2282c = ((MayaUpdateProfileBaseFragment) ((InterfaceC2469a) c2194a.c.get())).f14238W;
                    if (interfaceC2282c != null) {
                        interfaceC2282c.u();
                    }
                }
                break;
            case 2:
                Throwable it = (Throwable) obj;
                j.g(it, "it");
                ((MayaBaseFragment) ((InterfaceC2394e) ((m) this.f19770b).c.get())).w1();
                ((m) this.f19770b).n(it, EnumC2032a.f19084b, true);
                break;
            case 3:
                Throwable it2 = (Throwable) obj;
                j.g(it2, "it");
                ((MayaBaseFragment) ((f) ((o) this.f19770b).c.get())).w1();
                ((o) this.f19770b).n(it2, EnumC2032a.f19084b, true);
                break;
            case 4:
                A7.j jVar = (A7.j) this.f19770b;
                PayMayaError payMayaErrorF3 = jVar.f((Throwable) obj, false);
                j.f(payMayaErrorF3, "paymayaErrorHandling(...)");
                if (!payMayaErrorF3.isSessionTimeout()) {
                    if (!payMayaErrorF3.isNetworkError()) {
                        yd.d dVar2 = (yd.d) jVar.c.get();
                        String strMSpiel = payMayaErrorF3.mSpiel();
                        j.f(strMSpiel, "mSpiel(...)");
                        final EDDApplicationStatusFragment eDDApplicationStatusFragment = (EDDApplicationStatusFragment) dVar2;
                        eDDApplicationStatusFragment.getClass();
                        eDDApplicationStatusFragment.y1(200, strMSpiel, new View.OnClickListener() { // from class: zd.h
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i) {
                                    case 0:
                                        EDDApplicationStatusFragment eDDApplicationStatusFragment2 = eDDApplicationStatusFragment;
                                        Callback.onClick_enter(view);
                                        try {
                                            eDDApplicationStatusFragment2.A1().o();
                                            return;
                                        } finally {
                                        }
                                    default:
                                        EDDApplicationStatusFragment eDDApplicationStatusFragment3 = eDDApplicationStatusFragment;
                                        Callback.onClick_enter(view);
                                        try {
                                            eDDApplicationStatusFragment3.A1().o();
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                    } else {
                        final EDDApplicationStatusFragment eDDApplicationStatusFragment2 = (EDDApplicationStatusFragment) ((yd.d) jVar.c.get());
                        eDDApplicationStatusFragment2.getClass();
                        eDDApplicationStatusFragment2.x1(100, new View.OnClickListener() { // from class: zd.h
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        EDDApplicationStatusFragment eDDApplicationStatusFragment22 = eDDApplicationStatusFragment2;
                                        Callback.onClick_enter(view);
                                        try {
                                            eDDApplicationStatusFragment22.A1().o();
                                            return;
                                        } finally {
                                        }
                                    default:
                                        EDDApplicationStatusFragment eDDApplicationStatusFragment3 = eDDApplicationStatusFragment2;
                                        Callback.onClick_enter(view);
                                        try {
                                            eDDApplicationStatusFragment3.A1().o();
                                            return;
                                        } finally {
                                        }
                                }
                            }
                        });
                    }
                }
                break;
            case 5:
                j.g((UpgradePlusReference) obj, "p0");
                Lb.a aVar = (Lb.a) this.f19770b;
                androidx.media3.datasource.cache.c.u(((com.paymaya.data.preference.a) aVar.f).f11330b, "key_edd_status", "for_approval");
                Object obj2 = (k) aVar.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hH.j.put("attribution", ((BaseFragment) ((k) aVar.c.get())).l1().f10371a);
                ((BaseFragment) obj2).o1(c1219hH);
                r rVar = ((EDDSubmissionReviewFragment) ((k) aVar.c.get())).f14553T;
                if (rVar != null) {
                    ((EDDActivity) rVar).w1();
                }
                break;
            case 6:
            case 7:
            case 10:
            default:
                Throwable p02 = (Throwable) obj;
                j.g(p02, "p0");
                C2516a c2516a = (C2516a) this.f19770b;
                c2516a.n(p02, new com.squareup.wire.internal.a(c2516a, 26));
                break;
            case 8:
                ProductV3 product = (ProductV3) obj;
                j.g(product, "product");
                ((se.f) this.f19770b).r(product);
                break;
            case 9:
                Throwable throwable3 = (Throwable) obj;
                j.g(throwable3, "throwable");
                i iVar = (i) this.f19770b;
                PayMayaError payMayaErrorF4 = iVar.f(throwable3, false);
                j.f(payMayaErrorF4, "paymayaErrorHandling(...)");
                iVar.m(payMayaErrorF4);
                break;
            case 11:
                ShopPurchaseHistoryBase shopPurchaseHistoryBase = (ShopPurchaseHistoryBase) obj;
                j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                ((A) this.f19770b).m(shopPurchaseHistoryBase);
                break;
            case 12:
                A7.j jVar2 = (A7.j) this.f19770b;
                PayMayaError payMayaErrorF5 = jVar2.f((Throwable) obj, false);
                j.f(payMayaErrorF5, "paymayaErrorHandling(...)");
                ((BaseFragment) ((ve.k) jVar2.c.get())).n1();
                if (!payMayaErrorF5.isSessionTimeout()) {
                    ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) jVar2.c.get());
                    shopV3PurchaseHistoryReceiptFragment.getClass();
                    InterfaceC2407L interfaceC2407L = shopV3PurchaseHistoryReceiptFragment.f14875V;
                    if (interfaceC2407L != null) {
                        ((ShopV3Activity) interfaceC2407L).o(shopV3PurchaseHistoryReceiptFragment.getString(R.string.pma_toast_error_title_shop_error), payMayaErrorF5.mSpiel());
                    }
                }
                break;
        }
    }

    public void b(int i, int i4, int i6) {
        zf.c cVar = (zf.c) this.f19770b;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = i - 1;
            boolean z4 = ((i4 >> (i11 - i10)) & 1) == 1;
            zf.c cVar2 = z4 ? cVar.f21397b : cVar.f21396a;
            if (cVar2 == null) {
                cVar2 = new zf.c();
                if (i10 == i11) {
                    cVar2.c = i6;
                    cVar2.e = true;
                }
                if (i4 == 0) {
                    cVar2.f21398d = true;
                }
                if (z4) {
                    cVar.f21397b = cVar2;
                } else {
                    cVar.f21396a = cVar2;
                }
            } else if (cVar2.e) {
                throw new IOException("node is leaf, no other following");
            }
            cVar = cVar2;
        }
    }

    public void c(int i, zf.c cVar) {
        zf.c cVar2 = (zf.c) this.f19770b;
        int i4 = 0;
        while (i4 < 12) {
            boolean z4 = ((i >> (11 - i4)) & 1) == 1;
            zf.c cVar3 = z4 ? cVar2.f21397b : cVar2.f21396a;
            if (cVar3 == null) {
                cVar3 = i4 == 11 ? cVar : new zf.c();
                if (i == 0) {
                    cVar3.f21398d = true;
                }
                if (z4) {
                    cVar2.f21397b = cVar3;
                } else {
                    cVar2.f21396a = cVar3;
                }
            } else if (cVar3.e) {
                throw new IOException("node is leaf, no other following");
            }
            cVar2 = cVar3;
            i4++;
        }
    }

    public C2379c f(String host, Long l6) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            j.g(host, "host");
            InetAddress byName = InetAddress.getByName(host);
            j.f(byName, "InetAddress.getByName(host)");
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(l6.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jCurrentTimeMillis / 1000;
                Long.signum(j);
                long j6 = jCurrentTimeMillis - (j * 1000);
                long j7 = j + 2208988800L;
                bArr[40] = (byte) (j7 >> 24);
                bArr[41] = (byte) (j7 >> 16);
                bArr[42] = (byte) (j7 >> 8);
                bArr[43] = (byte) j7;
                long j9 = (j6 * 4294967296L) / 1000;
                bArr[44] = (byte) (j9 >> 24);
                bArr[45] = (byte) (j9 >> 16);
                bArr[46] = (byte) (j9 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
                datagramSocket2.send(datagramPacket);
                byte[] buffer = Arrays.copyOf(bArr, 48);
                j.g(buffer, "buffer");
                datagramSocket2.receive(new DatagramPacket(buffer, buffer.length));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j10 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                byte b8 = buffer[0];
                int i = buffer[1] & 255;
                long jE = e(24, buffer);
                long jE2 = e(32, buffer);
                long jE3 = e(40, buffer);
                a((byte) ((b8 >> 6) & 3), (byte) (b8 & 7), i, jE3);
                try {
                    C2379c c2379c = new C2379c(j10, jElapsedRealtime2, ((jE3 - j10) + (jE2 - jE)) / 2, (C1989g) this.f19770b);
                    datagramSocket2.close();
                    return c2379c;
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket = datagramSocket2;
                    if (datagramSocket != null) {
                        datagramSocket.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
    public zzwe zza() {
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(AbstractC2338a.c() ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrs zzrsVar = new zzrs();
        zzrsVar.zzb((zzrb) this.f19770b);
        zzrdVar.zzh(zzrsVar.zzc());
        return zzws.zzf(zzrdVar);
    }

    public c(C1989g c1989g, C2377a c2377a, C2377a c2377a2) {
        this.f19769a = 14;
        this.f19770b = c1989g;
    }

    public c() {
        this.f19769a = 17;
        this.f19770b = new zf.c();
    }
}
