package com.shield.android.a;

import com.google.gson.q;
import com.paymaya.common.utility.AbstractC1213b;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15040d = {2017595595, 159295198, 1429766001, 1463097555, 1474846340, 2059496279, 1219769446, 565412050};

    /* JADX INFO: renamed from: cc, reason: collision with root package name */
    private final String f15041cc = f("㽤㽺㽤㽣");
    private final String cd = f("㽝㽅㽠㼣");

    /* JADX INFO: renamed from: ce, reason: collision with root package name */
    private final String f15042ce = f("㽝㽅㽠㼡");

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final String f15043cf = f("㽧㽡㽣㽹㼾㽽㼼㽴㽳㽲㽹㽳㽽㼷㽹㽴㽩");

    /* JADX INFO: renamed from: cg, reason: collision with root package name */
    private final int f15044cg = 19302;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private final int f15045ch = 2000;

    private static com.shield.android.a a(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.position(((int) f15040d[0]) ^ 2017595615);
        com.shield.android.a aVar = new com.shield.android.a();
        while (byteBufferOrder.remaining() > 0) {
            int i = byteBufferOrder.getShort() & (((int) f15040d[5]) ^ 2059506856);
            byte[] bArr2 = new byte[byteBufferOrder.getShort() & (((int) f15040d[5]) ^ 2059506856)];
            byteBufferOrder.get(bArr2);
            if (i == (((int) f15040d[2]) ^ 1429766000)) {
                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder2.get();
                byte b8 = byteBufferOrder2.get();
                aVar.a(String.valueOf((((int) f15040d[5]) ^ 2059506856) & byteBufferOrder2.getShort()));
                if (b8 == 1) {
                    byte[] bArr3 = new byte[4];
                    byteBufferOrder2.get(bArr3);
                    String hostAddress = InetAddress.getByAddress(bArr3).getHostAddress();
                    if (hostAddress != null) {
                        aVar.b(hostAddress);
                    }
                } else if (b8 == 2) {
                    byte[] bArr4 = new byte[((int) f15040d[6]) ^ 1219769462];
                    byteBufferOrder2.get(bArr4);
                    String hostAddress2 = InetAddress.getByAddress(bArr4).getHostAddress();
                    if (hostAddress2 != null) {
                        aVar.c(hostAddress2);
                    }
                }
            }
        }
        return aVar;
    }

    private com.shield.android.a ac() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.setSoTimeout(2000);
        long[] jArr = f15040d;
        byte[] bArr = new byte[((int) jArr[0]) ^ 2017595615];
        long j = jArr[1];
        bArr[((int) j) ^ 159295198] = ((int) j) ^ 159295198;
        long j6 = jArr[2];
        bArr[((int) j6) ^ 1429766000] = ((int) j6) ^ 1429766000;
        bArr[((int) jArr[3]) ^ 1463097553] = ((int) j) ^ 159295198;
        int i = 4;
        bArr[((int) jArr[4]) ^ 1474846343] = ((int) j) ^ 159295198;
        while (i < (((int) f15040d[0]) ^ 2017595615)) {
            bArr[i] = (byte) (Math.random() * 255.0d);
            long j7 = f15040d[2];
            int i4 = ~i;
            i = i + (((int) j7) ^ 1429766000) + (((int) j7) ^ 1429766000) + ((~(((int) j7) ^ 1429766000)) | i4) + (((((int) j7) ^ 1429766000) + i) - ((((((int) j7) ^ 1429766000) + i) + (((int) j7) ^ 1429766000)) + ((~(((int) j7) ^ 1429766000)) | i4)));
        }
        datagramSocket.send(new DatagramPacket(bArr, ((int) f15040d[0]) ^ 2017595615, InetAddress.getByName(this.f15043cf), 19302));
        byte[] bArr2 = new byte[512];
        try {
            datagramSocket.receive(new DatagramPacket(bArr2, 512));
            return a(bArr2);
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(f("㽇㽡㽣㽹㽓㽽㽻㽶㽲㽩㼾㽺㽠㽺㽿㽫㽰㽬㽩㽩㼺㼡") + e, new Object[((int) f15040d[1]) ^ 159295198]);
            return new com.shield.android.a();
        } finally {
            datagramSocket.close();
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15040d[1]) ^ 159295198;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15040d;
            long j = jArr[7];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 565428166) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 565428166)) + (((int) j6) ^ 1429766000), (~(((int) j) ^ 565428166)) | i4, i6, (((((int) j) ^ 565428166) + cCharAt) + (((int) j6) ^ 1429766000)) + ((~(((int) j) ^ 565428166)) | i4)) ^ (i % (((int) jArr[5]) ^ 2059506856))));
            long j7 = f15040d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1429766000) + (((int) j7) ^ 1429766000) + ((~(((int) j7) ^ 1429766000)) | i10) + (((((int) j7) ^ 1429766000) + i) - ((((((int) j7) ^ 1429766000) + i) + (((int) j7) ^ 1429766000)) + ((~(((int) j7) ^ 1429766000)) | i10)));
        }
        return sb2.toString();
    }

    public final Object ab() throws IOException {
        com.shield.android.a aVarAc = ac();
        q qVar = new q();
        qVar.l(this.f15041cc, aVarAc.a());
        qVar.l(this.cd, aVarAc.b());
        qVar.l(this.f15042ce, aVarAc.c());
        return qVar;
    }
}
