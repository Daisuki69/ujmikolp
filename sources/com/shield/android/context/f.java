package com.shield.android.context;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final a Companion = new a(0);
    private static final String cY = "f";
    private final Context cW;
    private final NativeUtils cX;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15114d = {1537202543};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15114d[0]) ^ 1537202542, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return f.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            f fVar = f.this;
            f.access$getCallStateInfo(fVar, fVar.getContext(), concurrentHashMapR);
            return concurrentHashMapR;
        }
    }

    public static final class c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15115d = {659966280};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15115d[0]) ^ 659966281, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return f.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = f.this.getNativeUtils().getKeyValue("Y");
            f fVar = f.this;
            concurrentHashMapR.put(keyValue, f.access$getPhotos(fVar, fVar.getContext()));
            return concurrentHashMapR;
        }
    }

    public f(Context context, NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(context, d("ꊻ턃\ue8d8琯㩈ᵮ軿"));
        kotlin.jvm.internal.j.g(nativeUtils, d("ꊶ턍\ue8c2琲㩛ᵳ軞䜱⏋醽좛"));
        this.cW = context;
        this.cX = nativeUtils;
    }

    public static final /* synthetic */ void access$getCallStateInfo(f fVar, Context context, ConcurrentHashMap concurrentHashMap) {
        String strD = d("ꊼ턅\ue8c5琺㩏ᵺ軮䜡");
        int iO = com.shield.android.internal.i.O(context);
        HashMap map = new HashMap();
        try {
            if (Build.VERSION.SDK_INT < 31) {
                Object systemService = context.getSystemService(d("ꊨ턄\ue8d9琵㩈"));
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                if (telephonyManager != null && telephonyManager.getCallState() == 2) {
                    strD = d("ꊬ턞\ue8c3琾");
                }
            } else if (com.shield.android.internal.i.j(context, d("ꊹ턂\ue8d2琩㩂ᵿ軯䝫⏒醴좚搙㉓\u196e賽䘮⍌ᇿ裦쐶扷녘壈Ⱉ陳䭙ꗇ튊\ue927\uf4ee程뵸\uded7\uef1f矠"))) {
                Object systemService2 = context.getSystemService(d("ꊬ턉\ue8da琾㩎ᵹ軦"));
                TelecomManager telecomManager = systemService2 instanceof TelecomManager ? (TelecomManager) systemService2 : null;
                if (telecomManager != null) {
                    strD = String.valueOf(telecomManager.isInCall() && iO >= 2);
                }
            }
        } catch (Exception unused) {
        }
        String strD2 = (!kotlin.jvm.internal.j.b(strD, d("ꊬ턞\ue8c3琾")) && iO < 2) ? d("ꊾ턍\ue8da琨㩈") : d("ꊬ턞\ue8c3琾");
        map.put(d("ꊹ턡"), String.valueOf(iO));
        map.put(d("ꊬ턡"), strD);
        concurrentHashMap.put(fVar.cX.getKeyValue(d("ꊾ턁")), strD2);
        concurrentHashMap.put(fVar.cX.getKeyValue(d("ꊾ턂")), new com.google.gson.j().k(map));
    }

    public static final /* synthetic */ String access$getPhotos(f fVar, Context context) {
        return w(context);
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        char c10 = 17840;
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

    private static String w(Context context) {
        if (!com.shield.android.internal.i.b(context, d("ꊹ턂\ue8d2琩㩂ᵿ軯䝫⏒醴좚搙㉓\u196e賽䘮⍌ᇿ裦쐶扷녘壈Ⱉ陦䭉ꗜ튁\ue930\uf4ff稙뵠\udec9\uef18矱뮝嶻꺵圽⯸"))) {
            return d("ꊼ턅\ue8c5琺㩏ᵺ軮䜡");
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{d("ꊇ턈\ue8d7琯㩌")}, d("ꊺ턙\ue8d5琰㩈ᵢ軔䜬⏆釱죕摔㈅"), new String[]{String.valueOf((Environment.getExternalStorageDirectory().toString() + d("ꋷ턨\ue8f5琒㩠ᴹ軈䜤⏏醴좚搕")).toLowerCase(Locale.getDefault()).hashCode())}, null);
            Integer numValueOf = cursorQuery != null ? Integer.valueOf(cursorQuery.getCount()) : null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return String.valueOf(numValueOf);
        } catch (Exception unused) {
            return d("ꊽ턞\ue8c4琴㩟");
        }
    }

    public final Context getContext() {
        return this.cW;
    }

    public final NativeUtils getNativeUtils() {
        return this.cX;
    }

    public List<g> scheduleJobs() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = cY;
        return C1132s.g(new g(androidx.camera.core.impl.a.n(sb2, str, '1'), 0L, null, new c(null), 6), new g(str + '2', 0L, null, new b(null), 6));
    }
}
