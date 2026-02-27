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
public final class Dimension extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 1, tag = 2)
    private final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 0, tag = 1)
    private final Integer width;
    public static final A Companion = new A();
    public static final ProtoAdapter<Dimension> ADAPTER = new C2538z(FieldEncoding.LENGTH_DELIMITED, z.a(Dimension.class), "type.googleapis.com/Dimension", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Dimension() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Dimension copy$default(Dimension dimension, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dimension.width;
        }
        if ((i & 2) != 0) {
            num2 = dimension.height;
        }
        if ((i & 4) != 0) {
            byteString = dimension.unknownFields();
        }
        return dimension.copy(num, num2, byteString);
    }

    public final Dimension copy(Integer num, Integer num2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Dimension(num, num2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return j.b(unknownFields(), dimension.unknownFields()) && j.b(this.width, dimension.width) && j.b(this.height, dimension.height);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m11newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.width != null) {
            AbstractC1414e.r(new StringBuilder("width="), this.width, arrayList);
        }
        if (this.height != null) {
            AbstractC1414e.r(new StringBuilder("height="), this.height, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Dimension{", "}", null, 56);
    }

    public /* synthetic */ Dimension(Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m11newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dimension(Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.width = num;
        this.height = num2;
    }
}
