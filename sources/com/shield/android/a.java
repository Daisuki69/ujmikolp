package com.shield.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.paymaya.common.utility.AbstractC1213b;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15012d = {53872013, 1595191098, 1197212970, 2006080835, 4615042, 2032404673};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15013a = d("");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15014b = d("");
    private String c = d("");

    /* JADX INFO: renamed from: com.shield.android.a$a, reason: collision with other inner class name */
    public static final class C0040a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15015d = {25363456, 1232988966, 1368993063, 608447684, 1981238584, 2112423980};
        private final String e;

        public C0040a(String str, boolean z4) {
            this.e = str;
        }

        public final String d() {
            return this.e;
        }
    }

    public static final class c implements IInterface {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15018d = {1559591433, 588125441, 399353950, 800406274, 568749507, 1571346227};
        private final IBinder h;

        public c(IBinder iBinder) {
            this.h = iBinder;
        }

        public static String d(String str) {
            int i = ((int) f15018d[3]) ^ 800395174;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15018d[1]) ^ 588125441;
            while (i4 < str.length()) {
                long[] jArr = f15018d;
                int i6 = (((i >> (((int) jArr[1]) ^ 588125441)) ^ (i >> (((int) jArr[2]) ^ 399353948))) ^ (i >> (((int) jArr[4]) ^ 568749504))) ^ (i >> 5);
                long j = jArr[0];
                i = (char) ((i >> (((int) j) ^ 1559591432)) | (((char) (i6 & (((int) j) ^ 1559591432))) << (((int) jArr[5]) ^ 1571346236)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15018d[0];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1559591432, i11, i10, (((int) j6) ^ 1559591432) + i10 + i11));
                long j7 = f15018d[0];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 1559591432) + (((int) j7) ^ 1559591432) + ((~(((int) j7) ^ 1559591432)) | i12) + (((((int) j7) ^ 1559591432) + i4) - ((((((int) j7) ^ 1559591432) + i4) + (((int) j7) ^ 1559591432)) + ((~(((int) j7) ^ 1559591432)) | i12)));
            }
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(boolean z4) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(d("ᨱെ蛹썤\ue1c2\uf0bd砆뱓并꽨\ud7a8\ueba2\uf58f窔봊廓꼷埋⯹ᖌ誘씉抓ㄿᣋత\u0605荼䇮ꂠ倌ꡅ呱ꩪ啯ꫦ픳\uea8e\uf539竆㴠黏伧⟄Ꮄআӛ舳䅼\u20fa္衂쑡\ue27d煭룱尨깎흷毁떠\udab1\ued14益㬪᷇躴䜎"));
                parcelObtain.writeInt(((int) f15018d[0]) ^ 1559591432);
                IBinder iBinder = this.h;
                long[] jArr = f15018d;
                iBinder.transact(((int) jArr[2]) ^ 399353948, parcelObtain, parcelObtain2, ((int) jArr[1]) ^ 588125441);
                parcelObtain2.readException();
                boolean z5 = (((int) f15018d[1]) ^ 588125441) != parcelObtain2.readInt() ? ((int) f15018d[0]) ^ 1559591432 : ((int) f15018d[1]) ^ 588125441;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z5;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.h;
        }

        public final String f() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(d("ᨱെ蛹썤\ue1c2\uf0bd砆뱓并꽨\ud7a8\ueba2\uf58f窔봊廓꼷埋⯹ᖌ誘씉抓ㄿᣋత\u0605荼䇮ꂠ倌ꡅ呱ꩪ啯ꫦ픳\uea8e\uf539竆㴠黏伧⟄Ꮄআӛ舳䅼\u20fa္衂쑡\ue27d煭룱尨깎흷毁떠\udab1\ued14益㬪᷇躴䜎"));
                IBinder iBinder = this.h;
                long[] jArr = f15018d;
                iBinder.transact(((int) jArr[0]) ^ 1559591432, parcelObtain, parcelObtain2, ((int) jArr[1]) ^ 588125441);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0040a a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(d("ݫϵ膤삋\ue01d\uf04d\uf83c籬㹢ἣ迢잡掌놜\ud89d氘똞\udb79\uedfd\uf6a8笎㶑Ậ輄쟓揻ㆀᢗఒ虓䌾⇻邯䠑\u2454ቹ襨"));
        }
        context.getPackageManager().getPackageInfo(d("\u074bϻ膧샋\ue013\uf057\uf878籼㹨Ὢ迥쟮掖놕\ud896氘뙗\udb71\uede8"), ((int) f15012d[0]) ^ 53872013);
        b bVar = new b((((int) f15012d[0]) ^ 53872013) == true ? (byte) 1 : (byte) 0);
        Intent intent = new Intent(d("\u074bϻ膧샋\ue015\uf056\uf873籩㹫ὦ辯잡掎놔\ud88a氓뙗\udb7b\ueda1\uf6a0笎㷂Ỷ輍쟒推㇃ᢟట虘䍰⇻邮䠅\u2458ች襾䒨ꈰ텄棢㐾驍䵱⛬፪觱쒅\ue229煦㣎"));
        intent.setPackage(d("\u074bϻ膧샋\ue015\uf056\uf873籩㹫ὦ辯잡掎놔\ud88a氓뙗\udb7b\ueda1\uf6a0笎㷂"));
        try {
            try {
                if (context.bindService(intent, bVar, ((int) f15012d[1]) ^ 1595191099)) {
                    c cVar = new c(bVar.e());
                    return new C0040a(cVar.f(), cVar.a(((int) f15012d[1]) ^ 1595191099));
                }
                context.unbindService(bVar);
                throw new IOException(d("ݯϻ膥삂\ue01e\uf05c\uf83c籞㹫ὢ迸쟠掃놟\ud896氒뙛\udb7c\uedfb\uf6ae笌㷟Ỹ輊쟗掲ㆁᢓట"));
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(bVar);
        }
    }

    public static String d(String str) {
        int i = ((int) f15012d[2]) ^ 1197214586;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15012d[0]) ^ 53872013;
        while (i4 < str.length()) {
            long[] jArr = f15012d;
            int i6 = (((i >> (((int) jArr[0]) ^ 53872013)) ^ (i >> (((int) jArr[3]) ^ 2006080833))) ^ (i >> (((int) jArr[4]) ^ 4615041))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1595191099)) | (((char) (i6 & (((int) j) ^ 1595191099))) << (((int) jArr[5]) ^ 2032404686)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15012d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1595191099, i11, i10, (((int) j6) ^ 1595191099) + i10 + i11));
            long j7 = f15012d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1595191099) + (((int) j7) ^ 1595191099) + ((~(((int) j7) ^ 1595191099)) | i12) + (((((int) j7) ^ 1595191099) + i4) - ((((((int) j7) ^ 1595191099) + i4) + (((int) j7) ^ 1595191099)) + ((~(((int) j7) ^ 1595191099)) | i12)));
        }
        return sb2.toString();
    }

    public String b() {
        return this.f15014b;
    }

    public String c() {
        return this.c;
    }

    public void b(String str) {
        kotlin.jvm.internal.j.g(str, d("݁Ϥ膼샑\ue033\uf05d\uf878籼㹢ὰ迲"));
        this.f15014b = str;
    }

    public void c(String str) {
        kotlin.jvm.internal.j.g(str, d("݁Ϥ膼샓\ue033\uf05d\uf878籼㹢ὰ迲"));
        this.c = str;
    }

    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15016d = {317202358, 1389518535, 1742450378};
        private final LinkedBlockingQueue<IBinder> f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f15017g;

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            this.f = new LinkedBlockingQueue<>(((int) f15016d[0]) ^ 317202359);
            this.f15017g = ((int) f15016d[1]) ^ 1389518535;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final IBinder e() throws InterruptedException {
            if (this.f15017g) {
                throw new IllegalStateException();
            }
            this.f15017g = ((int) f15016d[0]) ^ 317202359;
            return this.f.take();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ b(byte b8) {
            this();
        }
    }

    public String a() {
        return this.f15013a;
    }

    public void a(String str) {
        kotlin.jvm.internal.j.g(str, d("ݘϻ膸삑"));
        this.f15013a = str;
    }
}
