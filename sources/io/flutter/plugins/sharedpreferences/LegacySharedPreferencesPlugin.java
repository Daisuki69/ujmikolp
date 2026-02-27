package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.sharedpreferences.Messages;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import pg.j;

/* JADX INFO: loaded from: classes4.dex */
public class LegacySharedPreferencesPlugin implements FlutterPlugin, Messages.SharedPreferencesApi {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    private static final String JSON_LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private static final String TAG = "SharedPreferencesPlugin";
    private final SharedPreferencesListEncoder listEncoder;
    private SharedPreferences preferences;

    public static class ListEncoder implements SharedPreferencesListEncoder {
        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        @NonNull
        public List<String> decode(@NonNull String str) throws RuntimeException {
            try {
                return (List) new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        @NonNull
        public String encode(@NonNull List<String> list) throws RuntimeException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public LegacySharedPreferencesPlugin() {
        this(new ListEncoder());
    }

    @NonNull
    private Map<String, Object> getAllPrefs(@NonNull String str, @Nullable Set<String> set) throws RuntimeException {
        Map<String, ?> all = this.preferences.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                map.put(str2, transformPref(str2, obj));
            }
        }
        return map;
    }

    private void setUp(@NonNull j jVar, @NonNull Context context) {
        this.preferences = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            b.k(jVar, this);
        } catch (Exception e) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e);
        }
    }

    private Object transformPref(@NonNull String str, @NonNull Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? obj : this.listEncoder.decode(str2.substring(40));
            }
            if (str2.startsWith(BIG_INTEGER_PREFIX)) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.preferences.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.listEncoder.encode(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean clear(@NonNull String str, @Nullable List<String> list) throws RuntimeException {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        Map<String, ?> all = this.preferences.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Map<String, Object> getAll(@NonNull String str, @Nullable List<String> list) throws RuntimeException {
        return getAllPrefs(str, list == null ? null : new HashSet(list));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b.k(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean remove(@NonNull String str) {
        return Boolean.valueOf(this.preferences.edit().remove(str).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean setBool(@NonNull String str, @NonNull Boolean bool) {
        return Boolean.valueOf(this.preferences.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    @Deprecated
    public Boolean setDeprecatedStringList(@NonNull String str, @NonNull List<String> list) throws RuntimeException {
        return Boolean.valueOf(this.preferences.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.listEncoder.encode(list)).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean setDouble(@NonNull String str, @NonNull Double d10) {
        String string = Double.toString(d10.doubleValue());
        return Boolean.valueOf(this.preferences.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean setEncodedStringList(@NonNull String str, @NonNull String str2) throws RuntimeException {
        return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean setInt(@NonNull String str, @NonNull Long l6) {
        return Boolean.valueOf(this.preferences.edit().putLong(str, l6.longValue()).commit());
    }

    @Override // io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
    @NonNull
    public Boolean setString(@NonNull String str, @NonNull String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith(BIG_INTEGER_PREFIX) || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.preferences.edit().putString(str, str2).commit());
    }

    @VisibleForTesting
    public LegacySharedPreferencesPlugin(@NonNull SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this.listEncoder = sharedPreferencesListEncoder;
    }
}
