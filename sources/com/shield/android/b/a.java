package com.shield.android.b;

import Bj.E;
import Bj.H;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import com.shield.android.internal.f;
import com.shield.android.internal.i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15047d = {951060227, 152912501, 1477611121, 1321999309};
    public static final C0048a fw = new C0048a((((int) 951060227) ^ 951060227) == true ? 1 : 0);

    /* JADX INFO: renamed from: com.shield.android.b.a$a, reason: collision with other inner class name */
    public static final class C0048a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15048d = {-1966458536, 245365296, 2068222475, 2074425605, 942496593, 219511236, 1709287908};

        /* JADX INFO: renamed from: com.shield.android.b.a$a$a, reason: collision with other inner class name */
        public static final class C0049a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15049d = {585246939, 1367393411, 878335617, 836797917, 666410679};
            private /* synthetic */ NativeUtils fx;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0049a(NativeUtils nativeUtils, InterfaceC1526a<? super C0049a> interfaceC1526a) {
                super(((int) f15049d[0]) ^ 585246937, interfaceC1526a);
                this.fx = nativeUtils;
            }

            public static String f(String str) {
                StringBuilder sb2 = new StringBuilder();
                int i = ((int) f15049d[1]) ^ 1367393411;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    long[] jArr = f15049d;
                    long j = jArr[2];
                    long j6 = jArr[3];
                    int i4 = ~cCharAt;
                    int i6 = (((int) j) ^ 878367967) + cCharAt;
                    sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 878367967)) + (((int) j6) ^ 836797916), (~(((int) j) ^ 878367967)) | i4, i6, (((((int) j) ^ 878367967) + cCharAt) + (((int) j6) ^ 836797916)) + ((~(((int) j) ^ 878367967)) | i4)) ^ (i % (((int) jArr[4]) ^ 666394952))));
                    long j7 = f15049d[3];
                    int i10 = ~i;
                    i = i + (((int) j7) ^ 836797916) + (((int) j7) ^ 836797916) + ((~(((int) j7) ^ 836797916)) | i10) + (((((int) j7) ^ 836797916) + i) - ((((((int) j7) ^ 836797916) + i) + (((int) j7) ^ 836797916)) + ((~(((int) j7) ^ 836797916)) | i10)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new C0049a(this.fx, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((C0049a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                try {
                    if (f.bI()) {
                        return this.fx.isJiaguDetected() ? f("舴舶舽舺舯") : f("");
                    }
                } catch (Throwable th2) {
                    com.shield.android.k.a.dL().a(th2);
                }
                return f("");
            }
        }

        /* JADX INFO: renamed from: com.shield.android.b.a$a$b */
        public static final class b extends AbstractC1609c {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15050d = {-1221536426, 703339966, 1552176981, 443078135, 2083668072};
            int bE;
            /* synthetic */ Object bM;

            public b(InterfaceC1526a<? super b> interfaceC1526a) {
                super(interfaceC1526a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                this.bM = obj;
                this.bE |= ((int) f15050d[0]) ^ 925947222;
                return C0048a.this.b((Context) null, this);
            }
        }

        /* JADX INFO: renamed from: com.shield.android.b.a$a$c */
        public static final class c extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Pair<Boolean, String>>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15051d = {416701548, 1681333276, 1492051662, 1197660779, 660853705, 1904742906};
            private /* synthetic */ Context bV;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Context context, InterfaceC1526a<? super c> interfaceC1526a) {
                super(((int) f15051d[0]) ^ 416701550, interfaceC1526a);
                this.bV = context;
            }

            public static String d(String str) {
                int i = ((int) f15051d[3]) ^ 1197612167;
                StringBuilder sb2 = new StringBuilder();
                int i4 = ((int) f15051d[2]) ^ 1492051662;
                while (i4 < str.length()) {
                    long[] jArr = f15051d;
                    int i6 = (((i >> (((int) jArr[2]) ^ 1492051662)) ^ (i >> (((int) jArr[0]) ^ 416701550))) ^ (i >> (((int) jArr[4]) ^ 660853706))) ^ (i >> 5);
                    long j = jArr[1];
                    i = (char) ((i >> (((int) j) ^ 1681333277)) | (((char) (i6 & (((int) j) ^ 1681333277))) << (((int) jArr[5]) ^ 1904742901)));
                    char cCharAt = str.charAt(i4);
                    int i10 = cCharAt + i;
                    long j6 = f15051d[1];
                    int i11 = (~cCharAt) | (~i);
                    sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1681333277, i11, i10, (((int) j6) ^ 1681333277) + i10 + i11));
                    long j7 = f15051d[1];
                    int i12 = ~i4;
                    i4 = i4 + (((int) j7) ^ 1681333277) + (((int) j7) ^ 1681333277) + ((~(((int) j7) ^ 1681333277)) | i12) + (((((int) j7) ^ 1681333277) + i4) - ((((((int) j7) ^ 1681333277) + i4) + (((int) j7) ^ 1681333277)) + ((~(((int) j7) ^ 1681333277)) | i12)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new c(this.bV, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                try {
                    return Pair.create(Boolean.valueOf(((int) f15051d[1]) ^ 1681333277), this.bV.getPackageManager().getInstallerPackageName(String.valueOf(System.currentTimeMillis())));
                } catch (Exception unused) {
                    return Pair.create(Boolean.valueOf(((int) f15051d[2]) ^ 1492051662), d(""));
                }
            }
        }

        /* JADX INFO: renamed from: com.shield.android.b.a$a$d */
        public static final class d extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Pair<Boolean, String>>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15052d = {471558246, 1742965399, 1917207978, 2072683285, 1565835297, 1513214783};
            private /* synthetic */ Context bV;
            private /* synthetic */ NativeUtils fx;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Context context, NativeUtils nativeUtils, InterfaceC1526a<? super d> interfaceC1526a) {
                super(((int) f15052d[0]) ^ 471558244, interfaceC1526a);
                this.bV = context;
                this.fx = nativeUtils;
            }

            public static String f(String str) {
                StringBuilder sb2 = new StringBuilder();
                int i = ((int) f15052d[1]) ^ 1742965399;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    long[] jArr = f15052d;
                    long j = jArr[4];
                    long j6 = jArr[3];
                    int i4 = ~cCharAt;
                    int i6 = (((int) j) ^ 1565823098) + cCharAt;
                    sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1565823098)) + (((int) j6) ^ 2072683284), (~(((int) j) ^ 1565823098)) | i4, i6, (((((int) j) ^ 1565823098) + cCharAt) + (((int) j6) ^ 2072683284)) + ((~(((int) j) ^ 1565823098)) | i4)) ^ (i % (((int) jArr[5]) ^ 1513172160))));
                    long j7 = f15052d[3];
                    int i10 = ~i;
                    i = i + (((int) j7) ^ 2072683284) + (((int) j7) ^ 2072683284) + ((~(((int) j7) ^ 2072683284)) | i10) + (((((int) j7) ^ 2072683284) + i) - ((((((int) j7) ^ 2072683284) + i) + (((int) j7) ^ 2072683284)) + ((~(((int) j7) ^ 2072683284)) | i10)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new d(this.bV, this.fx, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                int i;
                char c;
                BufferedReader bufferedReader;
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                int i4 = 1742965399;
                char c10 = 1;
                try {
                    String[] strArrFileList = this.bV.fileList();
                    int i6 = ((int) f15052d[1]) ^ 1742965399;
                    int length = strArrFileList.length;
                    int i10 = i6;
                    while (i10 < length) {
                        String str = strArrFileList[i10];
                        String keyValue = this.fx.getKeyValue(f("倷"));
                        long[] jArr = f15052d;
                        char c11 = 0;
                        int i11 = 471558244;
                        if (C2576A.z(str, keyValue, ((int) jArr[c10]) ^ i4, ((int) jArr[0]) ^ 471558244)) {
                            FileInputStream fileInputStreamOpenFileInput = this.bV.openFileInput(str);
                            if (fileInputStreamOpenFileInput == null) {
                                return new Pair(Boolean.valueOf(((int) f15052d[c10]) ^ i4), f(""));
                            }
                            InputStreamReader inputStreamReader = Build.VERSION.SDK_INT >= (((int) f15052d[2]) ^ 1917207993) ? new InputStreamReader(fileInputStreamOpenFileInput, StandardCharsets.UTF_8) : new InputStreamReader(fileInputStreamOpenFileInput, Charset.forName(f("倎倎借偵偧")));
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                            } catch (Throwable unused) {
                            }
                            try {
                                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                    sb2.append(line);
                                    String strF = f("债倪倩倴倶倭倩倳");
                                    long[] jArr2 = f15052d;
                                    if (!C2576A.z(line, strF, ((int) jArr2[c10]) ^ i4, ((int) jArr2[0]) ^ 471558244)) {
                                        String strF2 = f("倹倿倾倹倳");
                                        long[] jArr3 = f15052d;
                                        if (!C2576A.z(line, strF2, ((int) jArr3[c10]) ^ i4, ((int) jArr3[0]) ^ 471558244)) {
                                            String strF3 = f("债倪倩倻倳倱倳倹");
                                            long[] jArr4 = f15052d;
                                            if (!C2576A.z(line, strF3, ((int) jArr4[c10]) ^ i4, ((int) jArr4[0]) ^ 471558244)) {
                                                String strF4 = f("倹倻倳倱倱倹值倲");
                                                long[] jArr5 = f15052d;
                                                if (!C2576A.z(line, strF4, ((int) jArr5[c10]) ^ i4, ((int) jArr5[0]) ^ 471558244)) {
                                                    String strF5 = f("倹倻倷倿倬倿倩");
                                                    long[] jArr6 = f15052d;
                                                    if (!C2576A.z(line, strF5, ((int) jArr6[c10]) ^ i4, ((int) jArr6[0]) ^ 471558244)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Pair pair = new Pair(Boolean.valueOf(((int) f15052d[3]) ^ 2072683284), f(""));
                                    bufferedReader.close();
                                    return pair;
                                }
                                Unit unit = Unit.f18162a;
                                bufferedReader.close();
                                return new Pair(Boolean.valueOf(((int) f15052d[c10]) ^ i4), sb2.toString().getBytes(C2581c.f21468b).toString());
                            } finally {
                            }
                        } else {
                            File file = new File(this.bV.getApplicationInfo().dataDir + f("側倩倱倹倭倻倹倃倣倠倴倶値偹倶倻倦偤倨倸倿倢値倿倷倭偯倡倷倶倦倨倔倔倜倊偑倝們倝倀倁倔倃偙倎倘倘"));
                            if (file.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                i = i4;
                                c = c10;
                                try {
                                    InputStreamReader inputStreamReader2 = Build.VERSION.SDK_INT >= (((int) f15052d[2]) ^ 1917207993) ? new InputStreamReader(fileInputStream, StandardCharsets.UTF_8) : new InputStreamReader(fileInputStream, Charset.forName(f("倎倎借偵偧")));
                                    StringBuilder sb3 = new StringBuilder();
                                    try {
                                        bufferedReader = new BufferedReader(inputStreamReader2);
                                        try {
                                            String line2 = bufferedReader.readLine();
                                            while (line2 != null) {
                                                sb3.append(line2);
                                                String strF6 = f("债倪倩倴倶倭倩倳");
                                                long[] jArr7 = f15052d;
                                                char c12 = c11;
                                                int i12 = i11;
                                                if (C2576A.z(line2, strF6, ((int) jArr7[c]) ^ i, ((int) jArr7[c12]) ^ i12)) {
                                                    Pair pair2 = new Pair(Boolean.valueOf(((int) f15052d[3]) ^ 2072683284), f(""));
                                                    bufferedReader.close();
                                                    return pair2;
                                                }
                                                line2 = bufferedReader.readLine();
                                                c11 = c12;
                                                i11 = i12;
                                            }
                                            Pair pair3 = new Pair(Boolean.valueOf(((int) f15052d[c]) ^ i), sb3.toString());
                                            bufferedReader.close();
                                            return pair3;
                                        } finally {
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable unused3) {
                                }
                            } else {
                                i = i4;
                                c = c10;
                            }
                            int i13 = ((int) f15052d[3]) ^ 2072683284;
                            int i14 = i10 + i13;
                            int i15 = i14 + i13 + ((~i13) | (~i10));
                            i10 = (i14 - i15) + i15;
                            i4 = i;
                            c10 = c;
                        }
                    }
                } catch (Throwable unused4) {
                }
                i = i4;
                c = c10;
                return new Pair(Boolean.valueOf(((int) f15052d[c]) ^ i), f(""));
            }
        }

        /* JADX INFO: renamed from: com.shield.android.b.a$a$e */
        public static final class e extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15053d = {1615595637, 1622059641, 1701881818, 2057930113};
            private /* synthetic */ NativeUtils fx;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(NativeUtils nativeUtils, InterfaceC1526a<? super e> interfaceC1526a) {
                super(((int) f15053d[0]) ^ 1615595639, interfaceC1526a);
                this.fx = nativeUtils;
            }

            public static String g(String str) {
                StringBuilder sb2 = new StringBuilder();
                int i = ((int) f15053d[1]) ^ 1622059641;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    long[] jArr = f15053d;
                    long j = jArr[2];
                    long j6 = jArr[3];
                    int i4 = ~cCharAt;
                    int i6 = (((int) j) ^ 1701898398) + cCharAt;
                    sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1701898398) + (((int) j6) ^ 2057930112), i4 | (~(((int) j) ^ 1701898398)), i6, (((int) j) ^ 1701898398) + cCharAt + (((int) j6) ^ 2057930112) + ((~(((int) j) ^ 1701898398)) | i4)));
                    long j7 = f15053d[3];
                    int i10 = ~i;
                    i = i + (((int) j7) ^ 2057930112) + (((int) j7) ^ 2057930112) + ((~(((int) j7) ^ 2057930112)) | i10) + (((((int) j7) ^ 2057930112) + i) - ((((((int) j7) ^ 2057930112) + i) + (((int) j7) ^ 2057930112)) + ((~(((int) j7) ^ 2057930112)) | i10)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new e(this.fx, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((e) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                try {
                    if (f.bI()) {
                        return this.fx.isGboxDetected() ? g("伣伦伫似") : this.fx.isChaosDetected() ? g("伧伬伥伫伷") : this.fx.isVirtualCameraAppDetected() ? g("伲伧伥伴伴") : g("");
                    }
                } catch (Throwable unused) {
                }
                return g("");
            }
        }

        private C0048a() {
        }

        public static Object a(NativeUtils nativeUtils, InterfaceC1526a<? super String> interfaceC1526a) {
            return H.C(new e(nativeUtils, null), interfaceC1526a.getContext(), interfaceC1526a);
        }

        public static Object b(NativeUtils nativeUtils, InterfaceC1526a<? super String> interfaceC1526a) {
            return H.C(new C0049a(nativeUtils, null), interfaceC1526a.getContext(), interfaceC1526a);
        }

        public static String d(String str) {
            int i = ((int) f15048d[2]) ^ 2068211774;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15048d[3]) ^ 2074425605;
            while (i4 < str.length()) {
                long[] jArr = f15048d;
                int i6 = (((i >> (((int) jArr[3]) ^ 2074425605)) ^ (i >> (((int) jArr[4]) ^ 942496595))) ^ (i >> (((int) jArr[5]) ^ 219511239))) ^ (i >> 5);
                long j = jArr[1];
                i = (char) ((i >> (((int) j) ^ 245365297)) | (((char) (i6 & (((int) j) ^ 245365297))) << (((int) jArr[6]) ^ 1709287915)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15048d[1];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 245365297, i11, i10, (((int) j6) ^ 245365297) + i10 + i11));
                long j7 = f15048d[1];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 245365297) + (((int) j7) ^ 245365297) + ((~(((int) j7) ^ 245365297)) | i12) + (((((int) j7) ^ 245365297) + i4) - ((((((int) j7) ^ 245365297) + i4) + (((int) j7) ^ 245365297)) + ((~(((int) j7) ^ 245365297)) | i12)));
            }
            return sb2.toString();
        }

        public /* synthetic */ C0048a(byte b8) {
            this();
        }

        public static Object a(NativeUtils nativeUtils, Context context, InterfaceC1526a<? super Pair<Boolean, String>> interfaceC1526a) {
            return H.C(new d(context, nativeUtils, null), interfaceC1526a.getContext(), interfaceC1526a);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(android.content.Context r6, gj.InterfaceC1526a<? super android.util.Pair<java.lang.Boolean, java.lang.String>> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.shield.android.b.a.C0048a.b
                if (r0 == 0) goto L1b
                r0 = r7
                com.shield.android.b.a$a$b r0 = (com.shield.android.b.a.C0048a.b) r0
                int r1 = r0.bE
                long[] r2 = com.shield.android.b.a.C0048a.f15048d
                r3 = 0
                r3 = r2[r3]
                int r2 = (int) r3
                r3 = 181025112(0xaca3958, float:1.9473463E-32)
                r2 = r2 ^ r3
                r3 = r1 & r2
                if (r3 == 0) goto L1b
                int r1 = r1 - r2
                r0.bE = r1
                goto L20
            L1b:
                com.shield.android.b.a$a$b r0 = new com.shield.android.b.a$a$b
                r0.<init>(r7)
            L20:
                java.lang.Object r7 = r0.bM
                hj.a r1 = hj.EnumC1578a.f17050a
                int r2 = r0.bE
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L2f
                bj.AbstractC1039j.b(r7)
                return r7
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "ﵹﻬＪￏ翱뾜徛\u2fda៚\u0b8c薚䊌ℊგ࠺萈䈷Ⅹრࠤюɢŭ肤쁥恈ま\u187e豫왩捤놧壠Ⱇ陙쭬\ue5e4狦뤀峞⸪靃쯣\ue5bf犌뤜\udcdc"
                java.lang.String r7 = d(r7)
                r6.<init>(r7)
                throw r6
            L3b:
                bj.AbstractC1039j.b(r7)
                kotlin.coroutines.CoroutineContext r7 = r0.getContext()
                com.shield.android.b.a$a$c r2 = new com.shield.android.b.a$a$c
                r4 = 0
                r2.<init>(r6, r4)
                long[] r6 = com.shield.android.b.a.C0048a.f15048d
                r3 = r6[r3]
                int r6 = (int) r3
                r3 = 245365297(0xe9ffa31, float:3.943745E-30)
                r6 = r6 ^ r3
                r0.bE = r6
                java.lang.Object r6 = Bj.H.C(r2, r7, r0)
                if (r6 != r1) goto L5a
                return r1
            L5a:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.shield.android.b.a.C0048a.b(android.content.Context, gj.a):java.lang.Object");
        }

        public static String a(byte[] bArr, String str) {
            j.g(bArr, d("ﵩﻤＡ"));
            j.g(str, d("ﵮﻬＡ"));
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(d("﵉ﻅ＇ﾒ"));
                messageDigest.update(bArr);
                return i.b(messageDigest.digest());
            } catch (Throwable th2) {
                com.shield.android.k.a.K(str).a(th2);
                return d("");
            }
        }
    }
}
