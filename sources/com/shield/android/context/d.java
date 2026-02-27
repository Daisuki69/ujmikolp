package com.shield.android.context;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bj.AbstractC1039j;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    private static final String cO;
    private final Context cL;
    private final NativeUtils cM;
    private final com.shield.android.a.d cN;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15103d = {725990346, 939515603, 1843465684};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15103d[0]) ^ 725990347, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return d.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00a1  */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15104d = {235301405};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15104d[0]) ^ 235301404, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return d.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = d.this.cM.getKeyValue("B");
            d dVar = d.this;
            concurrentHashMapR.put(keyValue, dVar.f(dVar.cL));
            String keyValue2 = d.this.cM.getKeyValue("v");
            d dVar2 = d.this;
            concurrentHashMapR.put(keyValue2, d.a(dVar2, dVar2.cL));
            concurrentHashMapR.put(d.this.cM.getKeyValue(TtmlNode.TAG_P), com.shield.android.e.i.hu);
            return concurrentHashMapR;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.d$d, reason: collision with other inner class name */
    public static final class C0055d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15105d = {805891425};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public C0055d(InterfaceC1526a<? super C0055d> interfaceC1526a) {
            super(((int) f15105d[0]) ^ 805891424, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return d.this.new C0055d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((C0055d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws IOException {
            Map mapR;
            String str;
            Map map;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                mapR = AbstractC1213b.R(obj);
                String keyValue = d.this.cM.getKeyValue("eo");
                com.shield.android.a.d dVar = d.this.cN;
                this.bO = mapR;
                this.bP = mapR;
                this.bQ = keyValue;
                this.bE = ((int) f15105d[0]) ^ 805891424;
                Object objAb = dVar.ab();
                if (objAb == enumC1578a) {
                    return enumC1578a;
                }
                str = keyValue;
                obj = objAb;
                map = mapR;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.bQ;
                mapR = (Map) this.bP;
                map = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
            }
            mapR.put(str, obj);
            return map;
        }
    }

    public static final class e extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15106d = {1583067215};

        public e(InterfaceC1526a<? super e> interfaceC1526a) {
            super(((int) f15106d[0]) ^ 1583067214, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return d.this.new e(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((e) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = d.this.cM.getKeyValue("y");
            d dVar = d.this;
            concurrentHashMapR.put(keyValue, d.c(dVar, dVar.cL));
            String keyValue2 = d.this.cM.getKeyValue("z");
            d dVar2 = d.this;
            concurrentHashMapR.put(keyValue2, d.d(dVar2, dVar2.cL));
            String keyValue3 = d.this.cM.getKeyValue(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            d dVar3 = d.this;
            concurrentHashMapR.put(keyValue3, d.e(dVar3, dVar3.cL));
            return concurrentHashMapR;
        }
    }

    static {
        new a((byte) 0);
        cO = "d";
    }

    public d(Context context, NativeUtils nativeUtils, com.shield.android.a.d dVar) {
        kotlin.jvm.internal.j.g(context, d("쏋憻낄堁걟噥ꭺ"));
        kotlin.jvm.internal.j.g(nativeUtils, d("쏆憵낞堜걌噸꭛嗳⪪锍䫃"));
        kotlin.jvm.internal.j.g(dVar, d("쏁憤낮堔걎噼ꭍ嗨⪯锍䫕ꔻ틘\ue939\uf4d9"));
        this.cL = context;
        this.cM = nativeUtils;
        this.cN = dVar;
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        char c10 = 34641;
        int i = 0;
        while (i < str.length()) {
            c10 = (char) ((c10 >> 1) | (((char) (((((c10 >> 2) ^ c10) ^ (c10 >> 3)) ^ (c10 >> 5)) & 1)) << 15));
            char cCharAt = str.charAt(i);
            int i4 = cCharAt + c10;
            int i6 = i4 + 1 + ((~cCharAt) | (~c10));
            sb2.append((char) (i6 - (i4 - i6)));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    public static final /* synthetic */ String e(d dVar, Context context) {
        return k(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.shield.android.internal.i.c(context, d("쏘憼낅堛걟"));
            if (Build.VERSION.SDK_INT < 29) {
                return g(context);
            }
            ArrayList arrayList = new ArrayList();
            SignalStrength signalStrength = telephonyManager.getSignalStrength();
            if (signalStrength == null) {
                return d("쏍憦나堚걈");
            }
            Iterator it = signalStrength.getCellSignalStrengths().iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((CellSignalStrength) it.next()).getDbm()));
            }
            return TextUtils.join(d("쎄"), arrayList);
        } catch (Exception unused) {
            return d("쏍憦나堚걈");
        }
    }

    @RequiresApi(api = 18)
    private static String g(Context context) throws SecurityException {
        Object systemService = context.getSystemService(d("쏘憼낅堛걟"));
        kotlin.jvm.internal.j.e(systemService, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭔ᗥબԅ苀섰\ue0c3\uf038\uf852ﱘ繫뽫忣⾦鞅쮂"));
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!com.shield.android.internal.i.b(context, d("쏉憺낎堇걕噴꭪喩⪳锄䫂ꔵ틅\ue925\uf4d8屮絅㻻ὤ迤작措놱墩Ⱞᙡ譙없\ue289焦㣮ᰔ蹣읕\ue3ca熑㢫鰾乶"))) {
            return d("쏌憽낙堔걘噱꭫嗣");
        }
        try {
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return d("");
            }
            ArrayList arrayList = new ArrayList();
            int size = allCellInfo.size();
            int i = 0;
            while (i < size) {
                if (allCellInfo.get(i).isRegistered()) {
                    if (allCellInfo.get(i) instanceof CellInfoWcdma) {
                        CellInfo cellInfo = allCellInfo.get(i);
                        kotlin.jvm.internal.j.e(cellInfo, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭃ᗥબԌ苹섶\ue0ca\uf039\uf87cﱶ繮뽨忣"));
                        arrayList.add(String.valueOf(((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm()));
                    } else if (allCellInfo.get(i) instanceof CellInfoGsm) {
                        CellInfo cellInfo2 = allCellInfo.get(i);
                        kotlin.jvm.internal.j.e(cellInfo2, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭃ᗥબԌ苹섶\ue0ca\uf039\uf86cﱦ繧"));
                        arrayList.add(String.valueOf(((CellInfoGsm) cellInfo2).getCellSignalStrength().getDbm()));
                    } else if (allCellInfo.get(i) instanceof CellInfoLte) {
                        CellInfo cellInfo3 = allCellInfo.get(i);
                        kotlin.jvm.internal.j.e(cellInfo3, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭃ᗥબԌ苹섶\ue0ca\uf039\uf867ﱡ繯"));
                        arrayList.add(String.valueOf(((CellInfoLte) cellInfo3).getCellSignalStrength().getDbm()));
                    } else if (allCellInfo.get(i) instanceof CellInfoCdma) {
                        CellInfo cellInfo4 = allCellInfo.get(i);
                        kotlin.jvm.internal.j.e(cellInfo4, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭃ᗥબԌ苹섶\ue0ca\uf039\uf868ﱱ繧뽤"));
                        arrayList.add(String.valueOf(((CellInfoCdma) cellInfo4).getCellSignalStrength().getDbm()));
                    } else if (Build.VERSION.SDK_INT >= 29 && androidx.webkit.internal.d.z(allCellInfo.get(i))) {
                        CellInfo cellInfo5 = allCellInfo.get(i);
                        kotlin.jvm.internal.j.e(cellInfo5, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖè+K聶쁹恬끭塯걹嘮⭃ᗥબԌ苹섶\ue0ca\uf039\uf87fﱱ繹뽦忦⾬鞁"));
                        arrayList.add(String.valueOf(androidx.webkit.internal.d.j(cellInfo5).getCellSignalStrength().getDbm()));
                    }
                }
                int i4 = i + 2 + ((~i) | (-2));
                i = ((i + 1) - i4) + i4;
            }
            return TextUtils.join(d("쎄"), arrayList);
        } catch (Exception unused) {
            return d("쏍憦나堚걈");
        }
    }

    private static String h(Context context) {
        try {
            Object systemService = context.getSystemService(d("쏋憻낄堛걟噾ꭺ嗮⪵锈䫄ꔡ"));
            kotlin.jvm.internal.j.e(systemService, d("쏆憡낆堙갚噾\uab6f嗩⪭锎䫄ꕸ틎\ue933\uf48b喝絋㻦Ἶ辅잦掆뇔墔Ⱂᙐ謲엡\ue2b2焏㣝ᱸ蹘읯\ue3fb熠㣂鰐乖❸ᏼনҊȕĖò+S耽쁊恫끬塯걥噣\u2b74ᗩશԉ苄섡\ue0e1\uf037\uf845ﱴ繭뽠忰"));
            ProxyInfo defaultProxy = ((ConnectivityManager) systemService).getDefaultProxy();
            String host = defaultProxy != null ? defaultProxy.getHost() : null;
            return host == null ? d("") : host;
        } catch (Exception unused) {
            return d("");
        }
    }

    private static String i(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) com.shield.android.internal.i.c(context, d("쏟憽낌堜"));
            if (com.shield.android.internal.i.b(context, d("쏉憺낎堇걕噴꭪喩⪳锄䫂ꔵ틅\ue925\uf4d8屮絅㻻ὤ迤작措놱墩Ⱞᙡ譈없\ue281焪㣮ᰋ蹸읗\ue3df熀")) && wifiManager.getConnectionInfo() != null) {
                int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
                if (kotlin.jvm.internal.j.b(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
                    ipAddress = Integer.reverseBytes(ipAddress);
                }
                try {
                    return InetAddress.getByAddress(BigInteger.valueOf(ipAddress).toByteArray()).getHostAddress();
                } catch (UnknownHostException unused) {
                    return d("쏍憦나堚걈");
                }
            }
            return d("쏌憽낙堔걘噱꭫嗣");
        } catch (Exception unused2) {
            return d("쏍憦나堚걈");
        }
    }

    private static String j(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) com.shield.android.internal.i.c(context, d("쏟憽낌堜"));
            if (!com.shield.android.internal.i.b(context, d("쏉憺낎堇걕噴꭪喩⪳锄䫂ꔵ틅\ue925\uf4d8屮絅㻻ὤ迤작措놱墩Ⱞᙡ譈없\ue281焪㣮ᰋ蹸읗\ue3df熀"))) {
                return d("쏌憽낙堔걘噱꭫嗣");
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            return new zj.o(d("쎊")).f(d(""), (com.shield.android.internal.i.a(connectionInfo.getSSID()) || kotlin.jvm.internal.j.b(d("쎔憡낄堞걔噲ꭹ嗩⫣锒䫃ꔱ틈\ue968"), connectionInfo.getSSID())) ? d("") : connectionInfo.getSSID());
        } catch (Exception unused) {
            return d("쏍憦나堚걈");
        }
    }

    private static String k(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) com.shield.android.internal.i.c(context, d("쏟憽낌堜"));
            if (!com.shield.android.internal.i.b(context, d("쏉憺낎堇걕噴꭪喩⪳锄䫂ꔵ틅\ue925\uf4d8屮絅㻻ὤ迤작措놱墩Ⱞᙡ譈없\ue281焪㣮ᰋ蹸읗\ue3df熀"))) {
                return d("쏌憽낙堔걘噱꭫嗣");
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (!com.shield.android.internal.i.a(connectionInfo.getBSSID()) && !kotlin.jvm.internal.j.b(d("쎘懤냐塅갊嘧ꬾ喷⫹镑䪀ꕢ튜\ue966\uf491贈級"), connectionInfo.getBSSID())) {
                return connectionInfo.getBSSID();
            }
            return d("");
        } catch (Exception unused) {
            return d("쏍憦나堚걈");
        }
    }

    public final List<g> ak() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = cO;
        return C1132s.g(new g(androidx.camera.core.impl.a.n(sb2, str, '1'), 0L, null, new b(null), 6), new g(str + '3', 0L, null, new c(null), 6), new g(str + '4', 0L, null, new C0055d(null), 6), new g(str + '2', 0L, null, new e(null), 6));
    }

    public static final /* synthetic */ String a(d dVar, Context context) {
        return h(context);
    }

    public static final /* synthetic */ String c(d dVar, Context context) {
        return i(context);
    }

    public static final /* synthetic */ String d(d dVar, Context context) {
        return j(context);
    }

    public static final /* synthetic */ String a(d dVar, String str) {
        return com.shield.android.internal.i.a(d("쏉憺낎堇걕噴꭪喩⪬锒䪞ꔋ틕\ue925\uf4df侮絇㻅Ἰ迊잢掌놆墎Ⱄᙛ譬"), str);
    }
}
