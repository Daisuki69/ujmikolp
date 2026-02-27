package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.T;
import dg.U;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Resolution extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    private final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    private final Integer width;
    public static final U Companion = new U();
    public static final ProtoAdapter<Resolution> ADAPTER = new T(FieldEncoding.LENGTH_DELIMITED, z.a(Resolution.class), "type.googleapis.com/dde.protobuf.fragments.Resolution", Syntax.PROTO_3, null, "dde-protobuf/fragments/Resolution.proto");

    public Resolution() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, Integer num, Integer num2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = resolution.width;
        }
        if ((i & 2) != 0) {
            num2 = resolution.height;
        }
        if ((i & 4) != 0) {
            byteString = resolution.unknownFields();
        }
        return resolution.copy(num, num2, byteString);
    }

    public final Resolution copy(Integer num, Integer num2, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Resolution(num, num2, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return j.b(unknownFields(), resolution.unknownFields()) && j.b(this.width, resolution.width) && j.b(this.height, resolution.height);
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
        return (Message.Builder) m248newBuilder();
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
        return C1110A.F(arrayList, ", ", "Resolution{", "}", null, 56);
    }

    public /* synthetic */ Resolution(Integer num, Integer num2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m248newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Resolution(Integer num, Integer num2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.width = num;
        this.height = num2;
    }
}
