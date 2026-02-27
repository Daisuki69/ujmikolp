package H4;

import Bj.H;
import Bj.U;
import Bj.r;
import K4.B;
import K4.n;
import K4.o;
import K4.p;
import K4.q;
import K4.s;
import K4.u;
import K4.v;
import K4.w;
import K4.x;
import M8.T2;
import android.os.SystemClock;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.L;
import cj.t;
import com.paymaya.domain.store.I;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.WireJsonAdapterFactory;
import defpackage.Extract;
import defpackage.Performance;
import dj.C1406d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.y;
import zj.z;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements G4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f2103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2104b;
    public final /* synthetic */ m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Kj.d f2105d;
    public final /* synthetic */ I e;
    public final /* synthetic */ C1406d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f2106g;
    public final /* synthetic */ long h;
    public final /* synthetic */ r i;

    public c(HashMap map, String str, m mVar, Kj.d dVar, I i, C1406d c1406d, y yVar, long j, r rVar) {
        this.f2103a = map;
        this.f2104b = str;
        this.c = mVar;
        this.f2105d = dVar;
        this.e = i;
        this.f = c1406d;
        this.f2106g = yVar;
        this.h = j;
        this.i = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(c cVar) {
        Object objA;
        HashMap map = cVar.f2103a;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    return;
                }
            }
        }
        C1406d<K4.g> c1406d = cVar.f;
        int iB = L.b(t.l(c1406d, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (K4.g gVar : c1406d) {
            linkedHashMap.put(gVar.f2622a, Long.valueOf(gVar.c - gVar.f2623b));
        }
        HashMap map2 = new HashMap();
        map2.putAll(linkedHashMap);
        ArrayList arrayListB = m.b(cVar.c, map2);
        y yVar = cVar.f2106g;
        Extract extract = (Extract) yVar.f18195a;
        Extract extract2 = extract.copy((3670015 & 1) != 0 ? extract.sdk_version : null, (3670015 & 2) != 0 ? extract.proto_version : 0, (3670015 & 4) != 0 ? extract.extraction_id : null, (3670015 & 8) != 0 ? extract.medias : null, (3670015 & 16) != 0 ? extract.media_count : null, (3670015 & 32) != 0 ? extract.contacts : null, (3670015 & 64) != 0 ? extract.calendar_events : null, (3670015 & 128) != 0 ? extract.calendar_reminders : null, (3670015 & 256) != 0 ? extract.collector_details : null, (3670015 & 512) != 0 ? extract.hardware : null, (3670015 & 1024) != 0 ? extract.general_data : null, (3670015 & 2048) != 0 ? extract.location : null, (3670015 & 4096) != 0 ? extract.installed_applications : null, (3670015 & 8192) != 0 ? extract.device_fonts : null, (3670015 & 16384) != 0 ? extract.wifi_networks : null, (3670015 & 32768) != 0 ? extract.network : null, (3670015 & 65536) != 0 ? extract.bluetooth : null, (3670015 & 131072) != 0 ? extract.sensors : null, (3670015 & 262144) != 0 ? extract.cameras : null, (3670015 & 524288) != 0 ? extract.performance : new Performance(Long.valueOf(SystemClock.elapsedRealtime() - cVar.h), arrayListB, null, 4, null), (3670015 & 1048576) != 0 ? extract.threats : null, (3670015 & 2097152) != 0 ? extract.unknownFields() : null);
        yVar.f18195a = extract2;
        boolean z4 = false;
        try {
            C1037h.a aVar = C1037h.f9166b;
            kotlin.jvm.internal.j.g(extract2, "extract");
            objA = new Moshi.Builder().add((JsonAdapter.Factory) new WireJsonAdapterFactory(null, z4, 3, 0 == true ? 1 : 0)).build().adapter(Extract.class).toJson(extract2);
            kotlin.jvm.internal.j.f(objA, "adapter.toJson(extract)");
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        r rVar = cVar.i;
        I i = cVar.e;
        if (thA == null) {
            String str = (String) objA;
            i.a(new B(false, map2, Integer.valueOf(z.l(str).length)));
            rVar.T(new C1037h(str));
        } else {
            i.a(new B(false, map2, 4));
            i.c("extract_info_serialization", thA);
            rVar.T(new C1037h(AbstractC1039j.a(new Exception("Serialization error! Aborting extraction."))));
        }
    }

    public static final void d(c cVar, T2 t22) {
        Object next;
        Iterator<E> it = cVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((K4.g) next).f2622a, cVar.f2104b)) {
                    break;
                }
            }
        }
        K4.g gVar = (K4.g) next;
        if (gVar != null) {
            gVar.c = SystemClock.elapsedRealtime();
        }
        boolean z4 = t22 instanceof q;
        y yVar = cVar.f2106g;
        if (z4) {
            Extract extract = (Extract) yVar.f18195a;
            yVar.f18195a = extract.copy((3670015 & 1) != 0 ? extract.sdk_version : null, (3670015 & 2) != 0 ? extract.proto_version : 0, (3670015 & 4) != 0 ? extract.extraction_id : null, (3670015 & 8) != 0 ? extract.medias : null, (3670015 & 16) != 0 ? extract.media_count : null, (3670015 & 32) != 0 ? extract.contacts : null, (3670015 & 64) != 0 ? extract.calendar_events : null, (3670015 & 128) != 0 ? extract.calendar_reminders : null, (3670015 & 256) != 0 ? extract.collector_details : null, (3670015 & 512) != 0 ? extract.hardware : ((q) t22).f2633a, (3670015 & 1024) != 0 ? extract.general_data : null, (3670015 & 2048) != 0 ? extract.location : null, (3670015 & 4096) != 0 ? extract.installed_applications : null, (3670015 & 8192) != 0 ? extract.device_fonts : null, (3670015 & 16384) != 0 ? extract.wifi_networks : null, (3670015 & 32768) != 0 ? extract.network : null, (3670015 & 65536) != 0 ? extract.bluetooth : null, (3670015 & 131072) != 0 ? extract.sensors : null, (3670015 & 262144) != 0 ? extract.cameras : null, (3670015 & 524288) != 0 ? extract.performance : null, (3670015 & 1048576) != 0 ? extract.threats : null, (3670015 & 2097152) != 0 ? extract.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.i) {
            Extract extract2 = (Extract) yVar.f18195a;
            yVar.f18195a = extract2.copy((3670015 & 1) != 0 ? extract2.sdk_version : null, (3670015 & 2) != 0 ? extract2.proto_version : 0, (3670015 & 4) != 0 ? extract2.extraction_id : null, (3670015 & 8) != 0 ? extract2.medias : null, (3670015 & 16) != 0 ? extract2.media_count : null, (3670015 & 32) != 0 ? extract2.contacts : null, (3670015 & 64) != 0 ? extract2.calendar_events : null, (3670015 & 128) != 0 ? extract2.calendar_reminders : null, (3670015 & 256) != 0 ? extract2.collector_details : null, (3670015 & 512) != 0 ? extract2.hardware : null, (3670015 & 1024) != 0 ? extract2.general_data : null, (3670015 & 2048) != 0 ? extract2.location : null, (3670015 & 4096) != 0 ? extract2.installed_applications : null, (3670015 & 8192) != 0 ? extract2.device_fonts : null, (3670015 & 16384) != 0 ? extract2.wifi_networks : null, (3670015 & 32768) != 0 ? extract2.network : null, (3670015 & 65536) != 0 ? extract2.bluetooth : ((K4.i) t22).f2625a, (3670015 & 131072) != 0 ? extract2.sensors : null, (3670015 & 262144) != 0 ? extract2.cameras : null, (3670015 & 524288) != 0 ? extract2.performance : null, (3670015 & 1048576) != 0 ? extract2.threats : null, (3670015 & 2097152) != 0 ? extract2.unknownFields() : null);
            return;
        }
        if (t22 instanceof n) {
            Extract extract3 = (Extract) yVar.f18195a;
            yVar.f18195a = extract3.copy((3670015 & 1) != 0 ? extract3.sdk_version : null, (3670015 & 2) != 0 ? extract3.proto_version : 0, (3670015 & 4) != 0 ? extract3.extraction_id : null, (3670015 & 8) != 0 ? extract3.medias : null, (3670015 & 16) != 0 ? extract3.media_count : null, (3670015 & 32) != 0 ? extract3.contacts : ((n) t22).f2630a, (3670015 & 64) != 0 ? extract3.calendar_events : null, (3670015 & 128) != 0 ? extract3.calendar_reminders : null, (3670015 & 256) != 0 ? extract3.collector_details : null, (3670015 & 512) != 0 ? extract3.hardware : null, (3670015 & 1024) != 0 ? extract3.general_data : null, (3670015 & 2048) != 0 ? extract3.location : null, (3670015 & 4096) != 0 ? extract3.installed_applications : null, (3670015 & 8192) != 0 ? extract3.device_fonts : null, (3670015 & 16384) != 0 ? extract3.wifi_networks : null, (3670015 & 32768) != 0 ? extract3.network : null, (3670015 & 65536) != 0 ? extract3.bluetooth : null, (3670015 & 131072) != 0 ? extract3.sensors : null, (3670015 & 262144) != 0 ? extract3.cameras : null, (3670015 & 524288) != 0 ? extract3.performance : null, (3670015 & 1048576) != 0 ? extract3.threats : null, (3670015 & 2097152) != 0 ? extract3.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.t) {
            Extract extract4 = (Extract) yVar.f18195a;
            yVar.f18195a = extract4.copy((3670015 & 1) != 0 ? extract4.sdk_version : null, (3670015 & 2) != 0 ? extract4.proto_version : 0, (3670015 & 4) != 0 ? extract4.extraction_id : null, (3670015 & 8) != 0 ? extract4.medias : ((K4.t) t22).f2636a, (3670015 & 16) != 0 ? extract4.media_count : null, (3670015 & 32) != 0 ? extract4.contacts : null, (3670015 & 64) != 0 ? extract4.calendar_events : null, (3670015 & 128) != 0 ? extract4.calendar_reminders : null, (3670015 & 256) != 0 ? extract4.collector_details : null, (3670015 & 512) != 0 ? extract4.hardware : null, (3670015 & 1024) != 0 ? extract4.general_data : null, (3670015 & 2048) != 0 ? extract4.location : null, (3670015 & 4096) != 0 ? extract4.installed_applications : null, (3670015 & 8192) != 0 ? extract4.device_fonts : null, (3670015 & 16384) != 0 ? extract4.wifi_networks : null, (3670015 & 32768) != 0 ? extract4.network : null, (3670015 & 65536) != 0 ? extract4.bluetooth : null, (3670015 & 131072) != 0 ? extract4.sensors : null, (3670015 & 262144) != 0 ? extract4.cameras : null, (3670015 & 524288) != 0 ? extract4.performance : null, (3670015 & 1048576) != 0 ? extract4.threats : null, (3670015 & 2097152) != 0 ? extract4.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.j) {
            Extract extract5 = (Extract) yVar.f18195a;
            yVar.f18195a = extract5.copy((3670015 & 1) != 0 ? extract5.sdk_version : null, (3670015 & 2) != 0 ? extract5.proto_version : 0, (3670015 & 4) != 0 ? extract5.extraction_id : null, (3670015 & 8) != 0 ? extract5.medias : null, (3670015 & 16) != 0 ? extract5.media_count : null, (3670015 & 32) != 0 ? extract5.contacts : null, (3670015 & 64) != 0 ? extract5.calendar_events : ((K4.j) t22).f2626a, (3670015 & 128) != 0 ? extract5.calendar_reminders : null, (3670015 & 256) != 0 ? extract5.collector_details : null, (3670015 & 512) != 0 ? extract5.hardware : null, (3670015 & 1024) != 0 ? extract5.general_data : null, (3670015 & 2048) != 0 ? extract5.location : null, (3670015 & 4096) != 0 ? extract5.installed_applications : null, (3670015 & 8192) != 0 ? extract5.device_fonts : null, (3670015 & 16384) != 0 ? extract5.wifi_networks : null, (3670015 & 32768) != 0 ? extract5.network : null, (3670015 & 65536) != 0 ? extract5.bluetooth : null, (3670015 & 131072) != 0 ? extract5.sensors : null, (3670015 & 262144) != 0 ? extract5.cameras : null, (3670015 & 524288) != 0 ? extract5.performance : null, (3670015 & 1048576) != 0 ? extract5.threats : null, (3670015 & 2097152) != 0 ? extract5.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.k) {
            Extract extract6 = (Extract) yVar.f18195a;
            yVar.f18195a = extract6.copy((3670015 & 1) != 0 ? extract6.sdk_version : null, (3670015 & 2) != 0 ? extract6.proto_version : 0, (3670015 & 4) != 0 ? extract6.extraction_id : null, (3670015 & 8) != 0 ? extract6.medias : null, (3670015 & 16) != 0 ? extract6.media_count : null, (3670015 & 32) != 0 ? extract6.contacts : null, (3670015 & 64) != 0 ? extract6.calendar_events : null, (3670015 & 128) != 0 ? extract6.calendar_reminders : ((K4.k) t22).f2627a, (3670015 & 256) != 0 ? extract6.collector_details : null, (3670015 & 512) != 0 ? extract6.hardware : null, (3670015 & 1024) != 0 ? extract6.general_data : null, (3670015 & 2048) != 0 ? extract6.location : null, (3670015 & 4096) != 0 ? extract6.installed_applications : null, (3670015 & 8192) != 0 ? extract6.device_fonts : null, (3670015 & 16384) != 0 ? extract6.wifi_networks : null, (3670015 & 32768) != 0 ? extract6.network : null, (3670015 & 65536) != 0 ? extract6.bluetooth : null, (3670015 & 131072) != 0 ? extract6.sensors : null, (3670015 & 262144) != 0 ? extract6.cameras : null, (3670015 & 524288) != 0 ? extract6.performance : null, (3670015 & 1048576) != 0 ? extract6.threats : null, (3670015 & 2097152) != 0 ? extract6.unknownFields() : null);
            return;
        }
        if (t22 instanceof p) {
            Extract extract7 = (Extract) yVar.f18195a;
            yVar.f18195a = extract7.copy((3670015 & 1) != 0 ? extract7.sdk_version : null, (3670015 & 2) != 0 ? extract7.proto_version : 0, (3670015 & 4) != 0 ? extract7.extraction_id : null, (3670015 & 8) != 0 ? extract7.medias : null, (3670015 & 16) != 0 ? extract7.media_count : null, (3670015 & 32) != 0 ? extract7.contacts : null, (3670015 & 64) != 0 ? extract7.calendar_events : null, (3670015 & 128) != 0 ? extract7.calendar_reminders : null, (3670015 & 256) != 0 ? extract7.collector_details : null, (3670015 & 512) != 0 ? extract7.hardware : null, (3670015 & 1024) != 0 ? extract7.general_data : ((p) t22).f2632a, (3670015 & 2048) != 0 ? extract7.location : null, (3670015 & 4096) != 0 ? extract7.installed_applications : null, (3670015 & 8192) != 0 ? extract7.device_fonts : null, (3670015 & 16384) != 0 ? extract7.wifi_networks : null, (3670015 & 32768) != 0 ? extract7.network : null, (3670015 & 65536) != 0 ? extract7.bluetooth : null, (3670015 & 131072) != 0 ? extract7.sensors : null, (3670015 & 262144) != 0 ? extract7.cameras : null, (3670015 & 524288) != 0 ? extract7.performance : null, (3670015 & 1048576) != 0 ? extract7.threats : null, (3670015 & 2097152) != 0 ? extract7.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.r) {
            Extract extract8 = (Extract) yVar.f18195a;
            yVar.f18195a = extract8.copy((3670015 & 1) != 0 ? extract8.sdk_version : null, (3670015 & 2) != 0 ? extract8.proto_version : 0, (3670015 & 4) != 0 ? extract8.extraction_id : null, (3670015 & 8) != 0 ? extract8.medias : null, (3670015 & 16) != 0 ? extract8.media_count : null, (3670015 & 32) != 0 ? extract8.contacts : null, (3670015 & 64) != 0 ? extract8.calendar_events : null, (3670015 & 128) != 0 ? extract8.calendar_reminders : null, (3670015 & 256) != 0 ? extract8.collector_details : null, (3670015 & 512) != 0 ? extract8.hardware : null, (3670015 & 1024) != 0 ? extract8.general_data : null, (3670015 & 2048) != 0 ? extract8.location : ((K4.r) t22).f2634a, (3670015 & 4096) != 0 ? extract8.installed_applications : null, (3670015 & 8192) != 0 ? extract8.device_fonts : null, (3670015 & 16384) != 0 ? extract8.wifi_networks : null, (3670015 & 32768) != 0 ? extract8.network : null, (3670015 & 65536) != 0 ? extract8.bluetooth : null, (3670015 & 131072) != 0 ? extract8.sensors : null, (3670015 & 262144) != 0 ? extract8.cameras : null, (3670015 & 524288) != 0 ? extract8.performance : null, (3670015 & 1048576) != 0 ? extract8.threats : null, (3670015 & 2097152) != 0 ? extract8.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.h) {
            Extract extract9 = (Extract) yVar.f18195a;
            yVar.f18195a = extract9.copy((3670015 & 1) != 0 ? extract9.sdk_version : null, (3670015 & 2) != 0 ? extract9.proto_version : 0, (3670015 & 4) != 0 ? extract9.extraction_id : null, (3670015 & 8) != 0 ? extract9.medias : null, (3670015 & 16) != 0 ? extract9.media_count : null, (3670015 & 32) != 0 ? extract9.contacts : null, (3670015 & 64) != 0 ? extract9.calendar_events : null, (3670015 & 128) != 0 ? extract9.calendar_reminders : null, (3670015 & 256) != 0 ? extract9.collector_details : null, (3670015 & 512) != 0 ? extract9.hardware : null, (3670015 & 1024) != 0 ? extract9.general_data : null, (3670015 & 2048) != 0 ? extract9.location : null, (3670015 & 4096) != 0 ? extract9.installed_applications : ((K4.h) t22).f2624a, (3670015 & 8192) != 0 ? extract9.device_fonts : null, (3670015 & 16384) != 0 ? extract9.wifi_networks : null, (3670015 & 32768) != 0 ? extract9.network : null, (3670015 & 65536) != 0 ? extract9.bluetooth : null, (3670015 & 131072) != 0 ? extract9.sensors : null, (3670015 & 262144) != 0 ? extract9.cameras : null, (3670015 & 524288) != 0 ? extract9.performance : null, (3670015 & 1048576) != 0 ? extract9.threats : null, (3670015 & 2097152) != 0 ? extract9.unknownFields() : null);
            return;
        }
        if (t22 instanceof o) {
            Extract extract10 = (Extract) yVar.f18195a;
            yVar.f18195a = extract10.copy((3670015 & 1) != 0 ? extract10.sdk_version : null, (3670015 & 2) != 0 ? extract10.proto_version : 0, (3670015 & 4) != 0 ? extract10.extraction_id : null, (3670015 & 8) != 0 ? extract10.medias : null, (3670015 & 16) != 0 ? extract10.media_count : null, (3670015 & 32) != 0 ? extract10.contacts : null, (3670015 & 64) != 0 ? extract10.calendar_events : null, (3670015 & 128) != 0 ? extract10.calendar_reminders : null, (3670015 & 256) != 0 ? extract10.collector_details : null, (3670015 & 512) != 0 ? extract10.hardware : null, (3670015 & 1024) != 0 ? extract10.general_data : null, (3670015 & 2048) != 0 ? extract10.location : null, (3670015 & 4096) != 0 ? extract10.installed_applications : null, (3670015 & 8192) != 0 ? extract10.device_fonts : ((o) t22).f2631a, (3670015 & 16384) != 0 ? extract10.wifi_networks : null, (3670015 & 32768) != 0 ? extract10.network : null, (3670015 & 65536) != 0 ? extract10.bluetooth : null, (3670015 & 131072) != 0 ? extract10.sensors : null, (3670015 & 262144) != 0 ? extract10.cameras : null, (3670015 & 524288) != 0 ? extract10.performance : null, (3670015 & 1048576) != 0 ? extract10.threats : null, (3670015 & 2097152) != 0 ? extract10.unknownFields() : null);
            return;
        }
        if (t22 instanceof x) {
            Extract extract11 = (Extract) yVar.f18195a;
            yVar.f18195a = extract11.copy((3670015 & 1) != 0 ? extract11.sdk_version : null, (3670015 & 2) != 0 ? extract11.proto_version : 0, (3670015 & 4) != 0 ? extract11.extraction_id : null, (3670015 & 8) != 0 ? extract11.medias : null, (3670015 & 16) != 0 ? extract11.media_count : null, (3670015 & 32) != 0 ? extract11.contacts : null, (3670015 & 64) != 0 ? extract11.calendar_events : null, (3670015 & 128) != 0 ? extract11.calendar_reminders : null, (3670015 & 256) != 0 ? extract11.collector_details : null, (3670015 & 512) != 0 ? extract11.hardware : null, (3670015 & 1024) != 0 ? extract11.general_data : null, (3670015 & 2048) != 0 ? extract11.location : null, (3670015 & 4096) != 0 ? extract11.installed_applications : null, (3670015 & 8192) != 0 ? extract11.device_fonts : null, (3670015 & 16384) != 0 ? extract11.wifi_networks : ((x) t22).f2640a, (3670015 & 32768) != 0 ? extract11.network : null, (3670015 & 65536) != 0 ? extract11.bluetooth : null, (3670015 & 131072) != 0 ? extract11.sensors : null, (3670015 & 262144) != 0 ? extract11.cameras : null, (3670015 & 524288) != 0 ? extract11.performance : null, (3670015 & 1048576) != 0 ? extract11.threats : null, (3670015 & 2097152) != 0 ? extract11.unknownFields() : null);
            return;
        }
        if (t22 instanceof u) {
            Extract extract12 = (Extract) yVar.f18195a;
            yVar.f18195a = extract12.copy((3670015 & 1) != 0 ? extract12.sdk_version : null, (3670015 & 2) != 0 ? extract12.proto_version : 0, (3670015 & 4) != 0 ? extract12.extraction_id : null, (3670015 & 8) != 0 ? extract12.medias : null, (3670015 & 16) != 0 ? extract12.media_count : null, (3670015 & 32) != 0 ? extract12.contacts : null, (3670015 & 64) != 0 ? extract12.calendar_events : null, (3670015 & 128) != 0 ? extract12.calendar_reminders : null, (3670015 & 256) != 0 ? extract12.collector_details : null, (3670015 & 512) != 0 ? extract12.hardware : null, (3670015 & 1024) != 0 ? extract12.general_data : null, (3670015 & 2048) != 0 ? extract12.location : null, (3670015 & 4096) != 0 ? extract12.installed_applications : null, (3670015 & 8192) != 0 ? extract12.device_fonts : null, (3670015 & 16384) != 0 ? extract12.wifi_networks : null, (3670015 & 32768) != 0 ? extract12.network : ((u) t22).f2637a, (3670015 & 65536) != 0 ? extract12.bluetooth : null, (3670015 & 131072) != 0 ? extract12.sensors : null, (3670015 & 262144) != 0 ? extract12.cameras : null, (3670015 & 524288) != 0 ? extract12.performance : null, (3670015 & 1048576) != 0 ? extract12.threats : null, (3670015 & 2097152) != 0 ? extract12.unknownFields() : null);
            return;
        }
        if (t22 instanceof v) {
            Extract extract13 = (Extract) yVar.f18195a;
            yVar.f18195a = extract13.copy((3670015 & 1) != 0 ? extract13.sdk_version : null, (3670015 & 2) != 0 ? extract13.proto_version : 0, (3670015 & 4) != 0 ? extract13.extraction_id : null, (3670015 & 8) != 0 ? extract13.medias : null, (3670015 & 16) != 0 ? extract13.media_count : null, (3670015 & 32) != 0 ? extract13.contacts : null, (3670015 & 64) != 0 ? extract13.calendar_events : null, (3670015 & 128) != 0 ? extract13.calendar_reminders : null, (3670015 & 256) != 0 ? extract13.collector_details : null, (3670015 & 512) != 0 ? extract13.hardware : null, (3670015 & 1024) != 0 ? extract13.general_data : null, (3670015 & 2048) != 0 ? extract13.location : null, (3670015 & 4096) != 0 ? extract13.installed_applications : null, (3670015 & 8192) != 0 ? extract13.device_fonts : null, (3670015 & 16384) != 0 ? extract13.wifi_networks : null, (3670015 & 32768) != 0 ? extract13.network : null, (3670015 & 65536) != 0 ? extract13.bluetooth : null, (3670015 & 131072) != 0 ? extract13.sensors : ((v) t22).f2638a, (3670015 & 262144) != 0 ? extract13.cameras : null, (3670015 & 524288) != 0 ? extract13.performance : null, (3670015 & 1048576) != 0 ? extract13.threats : null, (3670015 & 2097152) != 0 ? extract13.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.l) {
            Extract extract14 = (Extract) yVar.f18195a;
            yVar.f18195a = extract14.copy((3670015 & 1) != 0 ? extract14.sdk_version : null, (3670015 & 2) != 0 ? extract14.proto_version : 0, (3670015 & 4) != 0 ? extract14.extraction_id : null, (3670015 & 8) != 0 ? extract14.medias : null, (3670015 & 16) != 0 ? extract14.media_count : null, (3670015 & 32) != 0 ? extract14.contacts : null, (3670015 & 64) != 0 ? extract14.calendar_events : null, (3670015 & 128) != 0 ? extract14.calendar_reminders : null, (3670015 & 256) != 0 ? extract14.collector_details : null, (3670015 & 512) != 0 ? extract14.hardware : null, (3670015 & 1024) != 0 ? extract14.general_data : null, (3670015 & 2048) != 0 ? extract14.location : null, (3670015 & 4096) != 0 ? extract14.installed_applications : null, (3670015 & 8192) != 0 ? extract14.device_fonts : null, (3670015 & 16384) != 0 ? extract14.wifi_networks : null, (3670015 & 32768) != 0 ? extract14.network : null, (3670015 & 65536) != 0 ? extract14.bluetooth : null, (3670015 & 131072) != 0 ? extract14.sensors : null, (3670015 & 262144) != 0 ? extract14.cameras : ((K4.l) t22).f2628a, (3670015 & 524288) != 0 ? extract14.performance : null, (3670015 & 1048576) != 0 ? extract14.threats : null, (3670015 & 2097152) != 0 ? extract14.unknownFields() : null);
            return;
        }
        if (t22 instanceof K4.m) {
            Extract extract15 = (Extract) yVar.f18195a;
            yVar.f18195a = extract15.copy((3670015 & 1) != 0 ? extract15.sdk_version : null, (3670015 & 2) != 0 ? extract15.proto_version : 0, (3670015 & 4) != 0 ? extract15.extraction_id : null, (3670015 & 8) != 0 ? extract15.medias : null, (3670015 & 16) != 0 ? extract15.media_count : null, (3670015 & 32) != 0 ? extract15.contacts : null, (3670015 & 64) != 0 ? extract15.calendar_events : null, (3670015 & 128) != 0 ? extract15.calendar_reminders : null, (3670015 & 256) != 0 ? extract15.collector_details : ((K4.m) t22).f2629a, (3670015 & 512) != 0 ? extract15.hardware : null, (3670015 & 1024) != 0 ? extract15.general_data : null, (3670015 & 2048) != 0 ? extract15.location : null, (3670015 & 4096) != 0 ? extract15.installed_applications : null, (3670015 & 8192) != 0 ? extract15.device_fonts : null, (3670015 & 16384) != 0 ? extract15.wifi_networks : null, (3670015 & 32768) != 0 ? extract15.network : null, (3670015 & 65536) != 0 ? extract15.bluetooth : null, (3670015 & 131072) != 0 ? extract15.sensors : null, (3670015 & 262144) != 0 ? extract15.cameras : null, (3670015 & 524288) != 0 ? extract15.performance : null, (3670015 & 1048576) != 0 ? extract15.threats : null, (3670015 & 2097152) != 0 ? extract15.unknownFields() : null);
        } else if (t22 instanceof s) {
            Extract extract16 = (Extract) yVar.f18195a;
            yVar.f18195a = extract16.copy((3670015 & 1) != 0 ? extract16.sdk_version : null, (3670015 & 2) != 0 ? extract16.proto_version : 0, (3670015 & 4) != 0 ? extract16.extraction_id : null, (3670015 & 8) != 0 ? extract16.medias : null, (3670015 & 16) != 0 ? extract16.media_count : ((s) t22).f2635a, (3670015 & 32) != 0 ? extract16.contacts : null, (3670015 & 64) != 0 ? extract16.calendar_events : null, (3670015 & 128) != 0 ? extract16.calendar_reminders : null, (3670015 & 256) != 0 ? extract16.collector_details : null, (3670015 & 512) != 0 ? extract16.hardware : null, (3670015 & 1024) != 0 ? extract16.general_data : null, (3670015 & 2048) != 0 ? extract16.location : null, (3670015 & 4096) != 0 ? extract16.installed_applications : null, (3670015 & 8192) != 0 ? extract16.device_fonts : null, (3670015 & 16384) != 0 ? extract16.wifi_networks : null, (3670015 & 32768) != 0 ? extract16.network : null, (3670015 & 65536) != 0 ? extract16.bluetooth : null, (3670015 & 131072) != 0 ? extract16.sensors : null, (3670015 & 262144) != 0 ? extract16.cameras : null, (3670015 & 524288) != 0 ? extract16.performance : null, (3670015 & 1048576) != 0 ? extract16.threats : null, (3670015 & 2097152) != 0 ? extract16.unknownFields() : null);
        } else if (t22 instanceof w) {
            Extract extract17 = (Extract) yVar.f18195a;
            yVar.f18195a = extract17.copy((3670015 & 1) != 0 ? extract17.sdk_version : null, (3670015 & 2) != 0 ? extract17.proto_version : 0, (3670015 & 4) != 0 ? extract17.extraction_id : null, (3670015 & 8) != 0 ? extract17.medias : null, (3670015 & 16) != 0 ? extract17.media_count : null, (3670015 & 32) != 0 ? extract17.contacts : null, (3670015 & 64) != 0 ? extract17.calendar_events : null, (3670015 & 128) != 0 ? extract17.calendar_reminders : null, (3670015 & 256) != 0 ? extract17.collector_details : null, (3670015 & 512) != 0 ? extract17.hardware : null, (3670015 & 1024) != 0 ? extract17.general_data : null, (3670015 & 2048) != 0 ? extract17.location : null, (3670015 & 4096) != 0 ? extract17.installed_applications : null, (3670015 & 8192) != 0 ? extract17.device_fonts : null, (3670015 & 16384) != 0 ? extract17.wifi_networks : null, (3670015 & 32768) != 0 ? extract17.network : null, (3670015 & 65536) != 0 ? extract17.bluetooth : null, (3670015 & 131072) != 0 ? extract17.sensors : null, (3670015 & 262144) != 0 ? extract17.cameras : null, (3670015 & 524288) != 0 ? extract17.performance : null, (3670015 & 1048576) != 0 ? extract17.threats : ((w) t22).f2639a, (3670015 & 2097152) != 0 ? extract17.unknownFields() : null);
        }
    }

    @Override // G4.b
    public final void a(Throwable th2) {
        this.e.c(this.f2104b, th2);
    }

    @Override // G4.b
    public final void b(T2 t22) {
        this.f2103a.put(this.f2104b, Boolean.TRUE);
        m mVar = this.c;
        H.w(mVar.f2139d, U.f603a, null, new b(this.f2105d, this, t22, null), 2);
    }
}
