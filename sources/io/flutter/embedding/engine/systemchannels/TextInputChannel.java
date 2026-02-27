package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.datasource.cache.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC1414e;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.editing.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pg.p;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";

    @NonNull
    public final u channel;

    @NonNull
    @VisibleForTesting
    final s parsingMethodHandler;

    @Nullable
    private TextInputMethodHandler textInputMethodHandler;

    public static class Configuration {

        @Nullable
        public final String actionLabel;
        public final boolean autocorrect;

        @Nullable
        public final Autofill autofill;

        @Nullable
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;

        @Nullable
        public final Configuration[] fields;

        @Nullable
        public final Integer inputAction;

        @NonNull
        public final InputType inputType;
        public final boolean obscureText;

        @NonNull
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(@NonNull String str, @NonNull String[] strArr, @Nullable String str2, @NonNull TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            @NonNull
            public static Autofill fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = translateAutofillHint(jSONArray.getString(i));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            @androidx.annotation.NonNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String translateAutofillHint(@androidx.annotation.NonNull java.lang.String r17) {
                /*
                    Method dump skipped, instruction units count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.translateAutofillHint(java.lang.String):java.lang.String");
            }
        }

        public Configuration(boolean z4, boolean z5, boolean z8, boolean z9, boolean z10, @NonNull TextCapitalization textCapitalization, @NonNull InputType inputType, @Nullable Integer num, @Nullable String str, @Nullable Autofill autofill, @Nullable String[] strArr, @Nullable Configuration[] configurationArr) {
            this.obscureText = z4;
            this.autocorrect = z5;
            this.enableSuggestions = z8;
            this.enableIMEPersonalizedLearning = z9;
            this.enableDeltaModel = z10;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
        }

        @NonNull
        public static Configuration fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i = 0; i < length; i++) {
                    configurationArr2[i] = fromJson(jSONArray.getJSONObject(i));
                }
                configurationArr = configurationArr2;
            }
            Integer numInputActionFromTextInputAction = inputActionFromTextInputAction(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    arrayList.add(jSONArray2.optString(i4));
                }
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), numInputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr);
        }

        @NonNull
        private static Integer inputActionFromTextInputAction(@NonNull String str) {
            str.getClass();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;

        @NonNull
        public final TextInputType type;

        public InputType(@NonNull TextInputType textInputType, boolean z4, boolean z5) {
            this.type = textInputType;
            this.isSigned = z4;
            this.isDecimal = z5;
        }

        @NonNull
        public static InputType fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        @NonNull
        private final String encodedName;

        TextCapitalization(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException(AbstractC1414e.h("No such TextCapitalization: ", str));
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;

        @NonNull
        public final String text;

        public TextEditState(@NonNull String str, int i, int i4, int i6, int i10) throws IndexOutOfBoundsException {
            if (!(i == -1 && i4 == -1) && (i < 0 || i4 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i4) + ")");
            }
            if (!(i6 == -1 && i10 == -1) && (i6 < 0 || i6 > i10)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i6) + ", " + String.valueOf(i10) + ")");
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i6));
            }
            if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
            }
            this.text = str;
            this.selectionStart = i;
            this.selectionEnd = i4;
            this.composingStart = i6;
            this.composingEnd = i10;
        }

        @NonNull
        public static TextEditState fromJson(@NonNull JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i = this.composingStart;
            return i >= 0 && this.composingEnd > i;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z4);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(@NonNull String str, @NonNull Bundle bundle);

        void setClient(int i, @NonNull Configuration configuration);

        void setEditableSizeAndTransform(double d10, double d11, @NonNull double[] dArr);

        void setEditingState(@NonNull TextEditState textEditState);

        void setPlatformViewClient(int i, boolean z4);

        void show();
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        @NonNull
        private final String encodedName;

        TextInputType(@NonNull String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException(AbstractC1414e.h("No such TextInputType: ", str));
        }
    }

    public TextInputChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                Object obj;
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                String str = rVar.f19112a;
                str.getClass();
                obj = rVar.f19113b;
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            tVar.success(null);
                            break;
                        } catch (JSONException e) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            tVar.success(null);
                            break;
                        } catch (JSONException e7) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e7.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            tVar.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e10) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e10.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        tVar.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        tVar.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            tVar.success(null);
                            break;
                        } catch (JSONException e11) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e11.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d10 = jSONObject3.getDouble("width");
                            double d11 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i = 0; i < 16; i++) {
                                dArr[i] = jSONArray2.getDouble(i);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d10, d11, dArr);
                            tVar.success(null);
                            break;
                        } catch (JSONException e12) {
                            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e12.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        tVar.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        tVar.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        tVar.success(null);
                        break;
                    default:
                        tVar.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/textinput", p.f19111a, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<i> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        for (i iVar : arrayList) {
            iVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("oldText", iVar.f17193a.toString());
                jSONObject.put("deltaText", iVar.f17194b.toString());
                jSONObject.put("deltaStart", iVar.c);
                jSONObject.put("deltaEnd", iVar.f17195d);
                jSONObject.put("selectionBase", iVar.e);
                jSONObject.put("selectionExtent", iVar.f);
                jSONObject.put("composingBase", iVar.f17196g);
                jSONObject.put("composingExtent", iVar.h);
            } catch (JSONException e) {
                Log.e("TextEditingDelta", "unable to create JSONObject: " + e);
            }
            jSONArray.put(jSONObject);
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i, int i4, int i6, int i10) {
        HashMap<Object, Object> mapP = c.p("text", str);
        c.t(i, mapP, "selectionBase", i4, "selectionExtent");
        c.t(i6, mapP, "composingBase", i10, "composingExtent");
        return mapP;
    }

    public void commitContent(int i, Map<String, Object> map) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.commitContent", map), null);
    }

    public void done(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"), null);
    }

    public void go(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"), null);
    }

    public void newline(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"), null);
    }

    public void next(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"), null);
    }

    public void performPrivateCommand(int i, @NonNull String str, @NonNull Bundle bundle) {
        HashMap mapP = c.p("action", str);
        if (bundle != null) {
            HashMap map = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            mapP.put("data", map);
        }
        this.channel.a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), mapP), null);
    }

    public void previous(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"), null);
    }

    public void requestExistingInputState() {
        this.channel.a("TextInputClient.requestExistingInputState", null, null);
    }

    public void search(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"), null);
    }

    public void send(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"), null);
    }

    public void setTextInputMethodHandler(@Nullable TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i) {
        this.channel.a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"), null);
    }

    public void updateEditingState(int i, @NonNull String str, int i4, int i6, int i10, int i11) {
        this.channel.a("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), createEditingStateJSON(str, i4, i6, i10, i11)), null);
    }

    public void updateEditingStateWithDeltas(int i, @NonNull ArrayList<i> arrayList) {
        arrayList.size();
        this.channel.a("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), createEditingDeltaJSON(arrayList)), null);
    }

    public void updateEditingStateWithTag(int i, @NonNull HashMap<String, TextEditState> map) {
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
            TextEditState value = entry.getValue();
            map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), map2), null);
    }
}
