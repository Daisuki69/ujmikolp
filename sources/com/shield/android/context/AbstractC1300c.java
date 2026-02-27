package com.shield.android.context;

import Bj.E;
import Bj.H;
import Bj.U;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bj.AbstractC1039j;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.context.z.a;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.shield.android.context.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1300c {
    private static final String cJ;
    private final Context cF;
    private final String cG;
    private final NativeUtils cH;
    private final z cI;

    /* JADX INFO: renamed from: com.shield.android.context.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.c$b */
    public static final class b extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ConcurrentHashMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15101d = {677174315, 576305793, -1341491403};
        private int bE;

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15101d[0]) ^ 677174313, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return AbstractC1300c.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            AbstractC1300c.this.cI.a(AbstractC1300c.this.scheduleJobs());
            z zVar = AbstractC1300c.this.cI;
            long[] jArr = f15101d;
            this.bE = ((int) jArr[1]) ^ 576305792;
            Object objZ = H.z(zVar.new a(jArr[2] ^ 1341491402, null), this);
            return objZ == enumC1578a ? enumC1578a : objZ;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.c$c, reason: collision with other inner class name */
    public static final class C0054c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15102d = {163863135};

        public C0054c(InterfaceC1526a<? super C0054c> interfaceC1526a) {
            super(((int) f15102d[0]) ^ 163863134, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return AbstractC1300c.this.new C0054c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((C0054c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(AbstractC1300c.this.ah().getKeyValue("n"), AbstractC1300c.this.aj());
            concurrentHashMapR.put(AbstractC1300c.this.ah().getKeyValue(TtmlNode.TAG_P), com.shield.android.e.i.hu);
            if (AbstractC1300c.this.ag() != null && zj.z.o(AbstractC1300c.this.ag(), "c936ac876525a84c4bfd132313b849b808d35f69", ((int) f15102d[0]) ^ 163863134)) {
                String keyValue = AbstractC1300c.this.ah().getKeyValue("o");
                AbstractC1300c abstractC1300c = AbstractC1300c.this;
                concurrentHashMapR.put(keyValue, AbstractC1300c.a(abstractC1300c, abstractC1300c.af()));
            }
            return concurrentHashMapR;
        }
    }

    static {
        new a((byte) 0);
        cJ = "c";
    }

    public AbstractC1300c(Context context, String str, NativeUtils nativeUtils, z zVar) {
        kotlin.jvm.internal.j.g(context, f("퓚퓗퓕퓎퓘퓄퓋"));
        kotlin.jvm.internal.j.g(nativeUtils, f("퓗퓙퓏퓓퓋퓙퓪퓊퓘퓜퓀"));
        kotlin.jvm.internal.j.g(zVar, f("퓓퓗퓙퓫퓈퓙퓊퓛"));
        this.cF = context;
        this.cG = str;
        this.cH = nativeUtils;
        this.cI = zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final String aj() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (!com.shield.android.internal.i.b(this.cF, f("퓘퓖퓟퓈퓒퓕퓛풐퓁퓕퓁퓟퓜퓇퓄퓟퓆퓆풅퓨퓡퓹퓪퓺퓮퓯퓷퓪"))) {
                return f("퓝퓑퓈퓛퓟퓐퓚퓚");
            }
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    return f("퓜퓊퓉퓕퓏");
                }
                if (!defaultAdapter.isEnabled()) {
                    return f("퓝퓑퓈퓛퓟퓐퓚퓚");
                }
                if (defaultAdapter.getBondedDevices() == null) {
                    return f("");
                }
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    sb2.append(bluetoothDevice.getAddress());
                    sb2.append(f("퓹"));
                    sb2.append(bluetoothDevice.getName());
                    sb2.append(f("풕"));
                }
                if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                return sb2.toString();
            } catch (Exception unused) {
                return f("퓜퓊퓉퓕퓏");
            }
        } catch (Exception unused2) {
            return f("퓜퓊퓉퓕퓏");
        }
    }

    private static String e(Context context) {
        try {
            new com.shield.android.b(context);
            return com.shield.android.b.g().toString();
        } catch (Exception unused) {
            return f("퓜퓊퓉퓕퓏");
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i4 = 54457 + cCharAt;
            int i6 = 54458 + cCharAt + ((~cCharAt) | (-54458));
            sb2.append((char) ((i % 65535) ^ (i6 - (i4 - i6))));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    public final Context af() {
        return this.cF;
    }

    public final String ag() {
        return this.cG;
    }

    public final NativeUtils ah() {
        return this.cH;
    }

    public final ConcurrentMap<String, Object> ai() {
        Ij.e eVar = U.f603a;
        return (ConcurrentMap) H.x(Ij.d.f2362a, new b(null));
    }

    public List<g> scheduleJobs() {
        return !com.shield.android.internal.f.bI() ? C1112C.f9377a : cj.r.c(new g(androidx.camera.core.impl.a.n(new StringBuilder(), cJ, '1'), 0L, null, new C0054c(null), 6));
    }

    public static final /* synthetic */ String a(AbstractC1300c abstractC1300c, Context context) {
        return e(context);
    }
}
