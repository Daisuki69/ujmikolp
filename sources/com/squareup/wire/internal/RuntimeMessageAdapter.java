package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import qj.n;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeMessageAdapter<M, B> extends ProtoAdapter<M> {
    public static final Companion Companion = new Companion(null);
    private static final String REDACTED = "██";
    private final MessageBinding<M, B> binding;
    private final FieldOrOneOfBinding<M, B>[] fieldBindingsArray;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final InterfaceC2488d messageType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeMessageAdapter(MessageBinding<M, B> binding) {
        String name;
        super(FieldEncoding.LENGTH_DELIMITED, binding.getMessageType(), binding.getTypeUrl(), binding.getSyntax(), null, null, 48, null);
        j.g(binding, "binding");
        this.binding = binding;
        this.messageType = binding.getMessageType();
        Map<Integer, FieldOrOneOfBinding<M, B>> fields = binding.getFields();
        this.fields = fields;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) fields.values().toArray(new FieldOrOneOfBinding[0]);
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding2 : fieldOrOneOfBindingArr2) {
            arrayList2.add(getJsonName(fieldOrOneOfBinding2));
        }
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr3 = this.fieldBindingsArray;
        ArrayList arrayList3 = new ArrayList(fieldOrOneOfBindingArr3.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding3 : fieldOrOneOfBindingArr3) {
            if (!j.b(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getDeclaredName())) {
                name = fieldOrOneOfBinding3.getDeclaredName();
            } else if (j.b(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getName())) {
                String strCamelCase$default = _PlatformKt.camelCase$default(fieldOrOneOfBinding3.getDeclaredName(), false, 2, null);
                name = (j.b(getJsonName(fieldOrOneOfBinding3), strCamelCase$default) || arrayList2.contains(strCamelCase$default)) ? null : strCamelCase$default;
            } else {
                name = fieldOrOneOfBinding3.getName();
            }
            arrayList3.add(name);
        }
        this.jsonAlternateNames = arrayList3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        B bNewBuilder = newBuilder();
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                reader.endMessageAndGetUnknownFields(jBeginMessage);
                return this.binding.build(bNewBuilder);
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fields.get(Integer.valueOf(iNextTag));
            if (fieldOrOneOfBinding != null) {
                try {
                    Object objDecode = (fieldOrOneOfBinding.isMap() ? fieldOrOneOfBinding.getAdapter() : fieldOrOneOfBinding.getSingleAdapter()).decode(reader);
                    j.d(objDecode);
                    fieldOrOneOfBinding.value(bNewBuilder, objDecode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    this.binding.addUnknownField(bNewBuilder, iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                FieldEncoding fieldEncodingPeekFieldEncoding = reader.peekFieldEncoding();
                j.d(fieldEncodingPeekFieldEncoding);
                this.binding.addUnknownField(bNewBuilder, iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, M value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), obj);
            }
        }
        writer.writeBytes(this.binding.unknownFields(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M value) {
        j.g(value, "value");
        int cachedSerializedSize = this.binding.getCachedSerializedSize(value);
        if (cachedSerializedSize != 0) {
            return cachedSerializedSize;
        }
        int iEncodedSizeWithTag = 0;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                iEncodedSizeWithTag += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj);
            }
        }
        int size = this.binding.unknownFields(value).size() + iEncodedSizeWithTag;
        this.binding.setCachedSerializedSize(value, size);
        return size;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && j.b(((RuntimeMessageAdapter) obj).messageType, this.messageType);
    }

    public final FieldOrOneOfBinding<M, B>[] getFieldBindingsArray() {
        return this.fieldBindingsArray;
    }

    public final Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    public final List<String> getJsonAlternateNames() {
        return this.jsonAlternateNames;
    }

    public final String getJsonName(FieldOrOneOfBinding<?, ?> fieldOrOneOfBinding) {
        j.g(fieldOrOneOfBinding, "<this>");
        return fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    public final List<String> getJsonNames() {
        return this.jsonNames;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    public final B newBuilder() {
        return this.binding.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M value) {
        j.g(value, "value");
        B bNewBuilder = this.binding.newBuilder();
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            if (fieldOrOneOfBinding.getRedacted() && fieldOrOneOfBinding.getLabel() == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + fieldOrOneOfBinding.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean zIsMessage = fieldOrOneOfBinding.isMessage();
            if (fieldOrOneOfBinding.getRedacted() || (zIsMessage && !fieldOrOneOfBinding.getLabel().isRepeated())) {
                Object fromBuilder = fieldOrOneOfBinding.getFromBuilder(bNewBuilder);
                if (fromBuilder != null) {
                    fieldOrOneOfBinding.set(bNewBuilder, fieldOrOneOfBinding.getAdapter().redact(fromBuilder));
                }
            } else if (zIsMessage && fieldOrOneOfBinding.getLabel().isRepeated()) {
                Object fromBuilder2 = fieldOrOneOfBinding.getFromBuilder(bNewBuilder);
                j.e(fromBuilder2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                j.e(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                fieldOrOneOfBinding.set(bNewBuilder, Internal.m186redactElements((List) fromBuilder2, singleAdapter));
            }
        }
        this.binding.clearUnknownFields(bNewBuilder);
        return this.binding.build(bNewBuilder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M value) {
        j.g(value, "value");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((C1790e) this.messageType).c());
        sb2.append('{');
        boolean z4 = true;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                if (!z4) {
                    sb2.append(", ");
                }
                sb2.append(fieldOrOneOfBinding.getName());
                sb2.append('=');
                if (fieldOrOneOfBinding.getRedacted()) {
                    obj = REDACTED;
                }
                sb2.append(obj);
                z4 = false;
            }
        }
        return androidx.camera.core.impl.a.k(sb2, '}', "toString(...)");
    }

    public final <A> void writeAllFields(M m, List<? extends A> jsonAdapters, A a8, n encodeValue) {
        j.g(jsonAdapters, "jsonAdapters");
        j.g(encodeValue, "encodeValue");
        int length = this.fieldBindingsArray.length;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[i];
            j.d(m);
            Object obj = fieldOrOneOfBinding.get(m);
            if (!fieldOrOneOfBinding.omitFromJson(getSyntax(), obj)) {
                if (!fieldOrOneOfBinding.getRedacted() || a8 == null || obj == null) {
                    encodeValue.invoke(this.jsonNames.get(i), obj, jsonAdapters.get(i));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(this.jsonNames.get(i));
                }
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return;
        }
        j.d(a8);
        encodeValue.invoke("__redacted_fields", arrayList, a8);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, M value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(this.binding.unknownFields(value));
        int length = this.fieldBindingsArray.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[length];
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), obj);
            }
        }
    }
}
