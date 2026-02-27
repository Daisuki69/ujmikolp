package H4;

import Bj.H;
import Bj.r;
import K4.w;
import M8.T2;
import android.os.SystemClock;
import com.paymaya.domain.store.J;
import defpackage.Extract;
import dj.C1406d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements G4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gj.c f2112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Kj.d f2113b;
    public final /* synthetic */ HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F4.a f2114d;
    public final /* synthetic */ J e;
    public final /* synthetic */ C1406d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f2115g;
    public final /* synthetic */ List h;
    public final /* synthetic */ m i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f2116k;

    public e(Gj.c cVar, Kj.d dVar, HashMap map, F4.a aVar, J j, C1406d c1406d, y yVar, List list, m mVar, long j6, r rVar) {
        this.f2112a = cVar;
        this.f2113b = dVar;
        this.c = map;
        this.f2114d = aVar;
        this.e = j;
        this.f = c1406d;
        this.f2115g = yVar;
        this.h = list;
        this.i = mVar;
        this.j = j6;
        this.f2116k = rVar;
    }

    public static final void c(e eVar, T2 t22) {
        Object next;
        Iterator<E> it = eVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((K4.g) next).f2622a, eVar.f2114d.b())) {
                    break;
                }
            }
        }
        K4.g gVar = (K4.g) next;
        if (gVar != null) {
            gVar.c = SystemClock.elapsedRealtime();
        }
        boolean z4 = t22 instanceof K4.m;
        y yVar = eVar.f2115g;
        if (z4) {
            Extract extract = (Extract) yVar.f18195a;
            yVar.f18195a = extract.copy((3670015 & 1) != 0 ? extract.sdk_version : null, (3670015 & 2) != 0 ? extract.proto_version : 0, (3670015 & 4) != 0 ? extract.extraction_id : null, (3670015 & 8) != 0 ? extract.medias : null, (3670015 & 16) != 0 ? extract.media_count : null, (3670015 & 32) != 0 ? extract.contacts : null, (3670015 & 64) != 0 ? extract.calendar_events : null, (3670015 & 128) != 0 ? extract.calendar_reminders : null, (3670015 & 256) != 0 ? extract.collector_details : ((K4.m) t22).f2629a, (3670015 & 512) != 0 ? extract.hardware : null, (3670015 & 1024) != 0 ? extract.general_data : null, (3670015 & 2048) != 0 ? extract.location : null, (3670015 & 4096) != 0 ? extract.installed_applications : null, (3670015 & 8192) != 0 ? extract.device_fonts : null, (3670015 & 16384) != 0 ? extract.wifi_networks : null, (3670015 & 32768) != 0 ? extract.network : null, (3670015 & 65536) != 0 ? extract.bluetooth : null, (3670015 & 131072) != 0 ? extract.sensors : null, (3670015 & 262144) != 0 ? extract.cameras : null, (3670015 & 524288) != 0 ? extract.performance : null, (3670015 & 1048576) != 0 ? extract.threats : null, (3670015 & 2097152) != 0 ? extract.unknownFields() : null);
        } else if (t22 instanceof w) {
            List list = ((w) t22).f2639a;
            Extract extract2 = (Extract) yVar.f18195a;
            yVar.f18195a = extract2.copy((3670015 & 1) != 0 ? extract2.sdk_version : null, (3670015 & 2) != 0 ? extract2.proto_version : 0, (3670015 & 4) != 0 ? extract2.extraction_id : null, (3670015 & 8) != 0 ? extract2.medias : null, (3670015 & 16) != 0 ? extract2.media_count : null, (3670015 & 32) != 0 ? extract2.contacts : null, (3670015 & 64) != 0 ? extract2.calendar_events : null, (3670015 & 128) != 0 ? extract2.calendar_reminders : null, (3670015 & 256) != 0 ? extract2.collector_details : null, (3670015 & 512) != 0 ? extract2.hardware : null, (3670015 & 1024) != 0 ? extract2.general_data : null, (3670015 & 2048) != 0 ? extract2.location : null, (3670015 & 4096) != 0 ? extract2.installed_applications : null, (3670015 & 8192) != 0 ? extract2.device_fonts : null, (3670015 & 16384) != 0 ? extract2.wifi_networks : null, (3670015 & 32768) != 0 ? extract2.network : null, (3670015 & 65536) != 0 ? extract2.bluetooth : null, (3670015 & 131072) != 0 ? extract2.sensors : null, (3670015 & 262144) != 0 ? extract2.cameras : null, (3670015 & 524288) != 0 ? extract2.performance : null, (3670015 & 1048576) != 0 ? extract2.threats : list, (3670015 & 2097152) != 0 ? extract2.unknownFields() : null);
        }
    }

    @Override // G4.b
    public final void a(Throwable th2) {
        this.e.c(this.f2114d.b(), th2);
    }

    @Override // G4.b
    public final void b(T2 t22) {
        H.w(this.f2112a, null, null, new d(this.f2113b, this, this.c, this.f2114d, t22, null), 3);
    }
}
