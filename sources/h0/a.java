package H0;

import android.content.Context;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f2070b = Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_ISO_SPEED_RATINGS, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_WHITE_BALANCE, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_DATETIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExifInterface f2071a;

    public a(String str) {
        this.f2071a = new ExifInterface(str);
    }

    public final ByteArrayOutputStream a(Context context, ByteArrayOutputStream byteArrayOutputStream) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        FileOutputStream fileOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        try {
            String string = UUID.randomUUID().toString();
            File file = new File(context.getCacheDir(), string + ".jpg");
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i = gk.a.f16849a;
                if (byteArray != null) {
                    fileOutputStream.write(byteArray);
                }
                fileOutputStream.close();
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                ExifInterface exifInterface2 = this.f2071a;
                for (String str : f2070b) {
                    if (exifInterface2.getAttribute(str) != null) {
                        exifInterface.setAttribute(str, exifInterface2.getAttribute(str));
                    }
                }
                try {
                    exifInterface.saveAttributes();
                } catch (IOException unused) {
                }
                exifInterface.saveAttributes();
                fileOutputStream.close();
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                fileInputStream = new FileInputStream(file);
            } catch (Exception e7) {
                fileInputStream = null;
                e = e7;
            }
        } catch (Exception e10) {
            fileInputStream = null;
            e = e10;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i4 = fileInputStream.read(bArr);
                if (-1 == i4) {
                    fileInputStream.close();
                    return byteArrayOutputStream2;
                }
                byteArrayOutputStream2.write(bArr, 0, i4);
            }
        } catch (Exception e11) {
            e = e11;
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            return byteArrayOutputStream;
        }
    }

    public a(byte[] bArr) {
        this.f2071a = new ExifInterface(new ByteArrayInputStream(bArr));
    }
}
