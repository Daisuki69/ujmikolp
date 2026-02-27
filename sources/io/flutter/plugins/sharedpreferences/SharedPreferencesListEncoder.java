package io.flutter.plugins.sharedpreferences;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SharedPreferencesListEncoder {
    @NonNull
    List<String> decode(@NonNull String str);

    @NonNull
    String encode(@NonNull List<String> list);
}
