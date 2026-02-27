package w3;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Bitmap f20685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f20686b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20687d;
    public final int e;
    public final int f;

    public C2376a(Bitmap bitmap) {
        this.f20685a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.c = bitmap.getWidth();
        this.f20687d = bitmap.getHeight();
        Preconditions.checkArgument(true, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        this.e = 0;
        this.f = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[PHI: r11
  0x00a6: PHI (r11v5 android.graphics.Matrix) = (r11v1 android.graphics.Matrix), (r11v2 android.graphics.Matrix) binds: [B:37:0x00a3, B:46:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9 A[Catch: FileNotFoundException -> 0x0043, TryCatch #3 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:36:0x008e, B:37:0x00a3, B:48:0x00d4, B:50:0x00de, B:39:0x00a8, B:40:0x00ac, B:41:0x00b3, B:42:0x00b7, B:43:0x00be, B:44:0x00c2, B:46:0x00c9, B:35:0x0088, B:32:0x0078, B:54:0x0102, B:55:0x0109), top: B:65:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w3.C2376a a(android.content.Context r17, android.net.Uri r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C2376a.a(android.content.Context, android.net.Uri):w3.a");
    }

    public C2376a(ByteBuffer byteBuffer, int i, int i4, int i6) {
        boolean z4 = true;
        Preconditions.checkArgument(true);
        this.f20686b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i * i4, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.c = i;
        this.f20687d = i4;
        if (i6 != 0 && i6 != 90 && i6 != 180 && i6 != 270) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        this.e = i6;
        this.f = 17;
    }
}
