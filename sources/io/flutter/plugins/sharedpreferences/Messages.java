package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static class PigeonCodec extends C2037D {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // pg.C2037D
        public Object readValueOfType(byte b8, @NonNull ByteBuffer byteBuffer) {
            return super.readValueOfType(b8, byteBuffer);
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    public interface SharedPreferencesApi {
        @NonNull
        Boolean clear(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Map<String, Object> getAll(@NonNull String str, @Nullable List<String> list);

        @NonNull
        Boolean remove(@NonNull String str);

        @NonNull
        Boolean setBool(@NonNull String str, @NonNull Boolean bool);

        @NonNull
        Boolean setDeprecatedStringList(@NonNull String str, @NonNull List<String> list);

        @NonNull
        Boolean setDouble(@NonNull String str, @NonNull Double d10);

        @NonNull
        Boolean setEncodedStringList(@NonNull String str, @NonNull String str2);

        @NonNull
        Boolean setInt(@NonNull String str, @NonNull Long l6);

        @NonNull
        Boolean setString(@NonNull String str, @NonNull String str2);
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }
}
