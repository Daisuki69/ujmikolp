package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class Extractor extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    private final Long duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String extractor;
    public static final E Companion = new E();
    public static final ProtoAdapter<Extractor> ADAPTER = new D(FieldEncoding.LENGTH_DELIMITED, z.a(Extractor.class), "type.googleapis.com/Extractor", Syntax.PROTO_3, null, "dde-protobuf/models/performance.proto");

    public Extractor() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Extractor copy$default(Extractor extractor, String str, Long l6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extractor.extractor;
        }
        if ((i & 2) != 0) {
            l6 = extractor.duration;
        }
        if ((i & 4) != 0) {
            byteString = extractor.unknownFields();
        }
        return extractor.copy(str, l6, byteString);
    }

    public final Extractor copy(String str, Long l6, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Extractor(str, l6, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extractor)) {
            return false;
        }
        Extractor extractor = (Extractor) obj;
        return j.b(unknownFields(), extractor.unknownFields()) && j.b(this.extractor, extractor.extractor) && j.b(this.duration, extractor.duration);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getExtractor() {
        return this.extractor;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.extractor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l6 = this.duration;
        int iHashCode3 = iHashCode2 + (l6 != null ? l6.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m13newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractor != null) {
            AbstractC1414e.p(this.extractor, new StringBuilder("extractor="), arrayList);
        }
        if (this.duration != null) {
            arrayList.add("duration=" + this.duration);
        }
        return C1110A.F(arrayList, ", ", "Extractor{", "}", null, 56);
    }

    public /* synthetic */ Extractor(String str, Long l6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l6, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m13newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Extractor(String str, Long l6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.extractor = str;
        this.duration = l6;
    }
}
