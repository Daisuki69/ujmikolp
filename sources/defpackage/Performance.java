package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Performance extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    private final Long duration;

    @WireField(adapter = "Extractor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Extractor> extractors;
    public static final o0 Companion = new o0();
    public static final ProtoAdapter<Performance> ADAPTER = new n0(FieldEncoding.LENGTH_DELIMITED, z.a(Performance.class), "type.googleapis.com/Performance", Syntax.PROTO_3, null, "dde-protobuf/models/performance.proto");

    public Performance() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Performance copy$default(Performance performance, Long l6, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            l6 = performance.duration;
        }
        if ((i & 2) != 0) {
            list = performance.extractors;
        }
        if ((i & 4) != 0) {
            byteString = performance.unknownFields();
        }
        return performance.copy(l6, list, byteString);
    }

    public final Performance copy(Long l6, List<Extractor> extractors, ByteString unknownFields) {
        j.g(extractors, "extractors");
        j.g(unknownFields, "unknownFields");
        return new Performance(l6, extractors, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Performance)) {
            return false;
        }
        Performance performance = (Performance) obj;
        return j.b(unknownFields(), performance.unknownFields()) && j.b(this.duration, performance.duration) && j.b(this.extractors, performance.extractors);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final List<Extractor> getExtractors() {
        return this.extractors;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l6 = this.duration;
        int iHashCode2 = this.extractors.hashCode() + ((iHashCode + (l6 != null ? l6.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.duration != null) {
            arrayList.add("duration=" + this.duration);
        }
        if (!this.extractors.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("extractors="), this.extractors, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Performance{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Performance(Long l6, List<Extractor> extractors, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(extractors, "extractors");
        j.g(unknownFields, "unknownFields");
        this.duration = l6;
        this.extractors = Internal.immutableCopyOf("extractors", extractors);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Performance(Long l6, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l6, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
