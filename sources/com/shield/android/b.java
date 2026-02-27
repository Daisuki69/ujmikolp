package com.shield.android;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15046d = {1624987552, 867362973, 1487584221, 495892899, 225039605, 1017658861};
    private static boolean i = ((int) 1624987552) ^ 1624987552;

    public b(Context context) {
    }

    public static void a(String str, com.shield.android.d.f fVar) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new k(str, fVar));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, com.shield.android.d.f fVar) {
        boolean zE = e(str);
        i = zE;
        if (zE) {
            fVar.onPingCompletion();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(String str) {
        try {
            ArrayList arrayList = new ArrayList(255);
            int i4 = ((int) f15046d[0]) ^ 1624987552;
            while (i4 < 255) {
                Runtime runtime = Runtime.getRuntime();
                arrayList.add(runtime.exec(f("养兣內兯儯儣兮儬儰儢") + (str + i4)));
                long j = f15046d[1];
                int i6 = ~i4;
                i4 = i4 + (((int) j) ^ 867362972) + (((int) j) ^ 867362972) + ((~(867362972 ^ ((int) j))) | i6) + (((((int) j) ^ 867362972) + i4) - ((((((int) j) ^ 867362972) + i4) + (((int) j) ^ 867362972)) + ((~(((int) j) ^ 867362972)) | i6)));
            }
            int i10 = ((int) f15046d[0]) ^ 1624987552;
            while (i10 < 255) {
                ((Process) arrayList.get(i10)).waitFor();
                long j6 = f15046d[1];
                int i11 = ~i10;
                i10 = i10 + (((int) j6) ^ 867362972) + (((int) j6) ^ 867362972) + ((~(((int) j6) ^ 867362972)) | i11) + (((((int) j6) ^ 867362972) + i10) - ((((((int) j6) ^ 867362972) + i10) + (((int) j6) ^ 867362972)) + ((~(((int) j6) ^ 867362972)) | i11)));
            }
            return ((int) f15046d[1]) ^ 867362972;
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return ((int) f15046d[0]) ^ 1624987552;
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15046d[0]) ^ 1624987552;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            long[] jArr = f15046d;
            long j = jArr[4];
            long j6 = jArr[1];
            int i6 = ~cCharAt;
            int i10 = (((int) j) ^ 225019390) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 225019390)) + (((int) j6) ^ 867362972), (~(((int) j) ^ 225019390)) | i6, i10, (((((int) j) ^ 225019390) + cCharAt) + (((int) j6) ^ 867362972)) + ((~(((int) j) ^ 225019390)) | i6)) ^ (i4 % (((int) jArr[5]) ^ 1017692690))));
            long j7 = f15046d[1];
            int i11 = ~i4;
            i4 = i4 + (((int) j7) ^ 867362972) + (((int) j7) ^ 867362972) + ((~(((int) j7) ^ 867362972)) | i11) + (((((int) j7) ^ 867362972) + i4) - ((((((int) j7) ^ 867362972) + i4) + (((int) j7) ^ 867362972)) + ((~(((int) j7) ^ 867362972)) | i11)));
        }
        return sb2.toString();
    }

    public static String g() {
        StringBuilder sb2 = new StringBuilder();
        if (Build.VERSION.SDK_INT >= (((int) f15046d[2]) ^ 1487584192)) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                long[] jArr = f15046d;
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[((int) jArr[0]) ^ 1624987552];
                ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[((int) jArr[1]) ^ 867362972];
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                if (new NativeUtils().getArpCache(parcelFileDescriptor2.detachFd()) != 0) {
                    return f("兊典兹儨兩兯兤兠兦兦");
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(autoCloseInputStream, StandardCharsets.UTF_8));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(f("儫儡"));
                    if (strArrSplit.length >= 4) {
                        sb2.append(strArrSplit[4]);
                        sb2.append(f("儧"));
                    }
                }
                if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - (((int) f15046d[1]) ^ 867362972));
                }
            } catch (IOException e) {
                com.shield.android.k.a.dL().a(e);
            }
        } else {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(f("儤兺养內公儡兣兩具儭兠兲具")));
                while (true) {
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        break;
                    }
                    String[] strArrSplit2 = line2.split(f("儫儡"));
                    if (strArrSplit2.length >= 4 && !strArrSplit2[((int) f15046d[3]) ^ 495892896].equals(f("儻儺儳儸儿儴儽儼儹儲儱儺儷儶儿儴儫")) && strArrSplit2[((int) f15046d[3]) ^ 495892896].matches(f("儥儤儳儦儡儴儣儢儹儬儯儺儩儨儿優儵"))) {
                        sb2.append(strArrSplit2[((int) f15046d[3]) ^ 495892896]);
                        sb2.append(f("儧"));
                    }
                }
                if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - (((int) f15046d[1]) ^ 867362972));
                }
            } catch (FileNotFoundException e7) {
                com.shield.android.k.a.dL().a(e7);
            } catch (IOException e10) {
                com.shield.android.k.a.dL().a(e10);
            }
        }
        return sb2.toString();
    }
}
