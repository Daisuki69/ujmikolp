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
public final class CrashDetail extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "data", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString data_;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString name;
    public static final C2493y Companion = new C2493y();
    public static final ProtoAdapter<CrashDetail> ADAPTER = new C2442x(FieldEncoding.LENGTH_DELIMITED, z.a(CrashDetail.class), "type.googleapis.com/CrashDetail", Syntax.PROTO_3, null, "tombstone.proto");

    public CrashDetail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CrashDetail copy$default(CrashDetail crashDetail, ByteString byteString, ByteString byteString2, ByteString byteString3, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = crashDetail.name;
        }
        if ((i & 2) != 0) {
            byteString2 = crashDetail.data_;
        }
        if ((i & 4) != 0) {
            byteString3 = crashDetail.unknownFields();
        }
        return crashDetail.copy(byteString, byteString2, byteString3);
    }

    public final CrashDetail copy(ByteString name, ByteString data_, ByteString unknownFields) {
        j.g(name, "name");
        j.g(data_, "data_");
        j.g(unknownFields, "unknownFields");
        return new CrashDetail(name, data_, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashDetail)) {
            return false;
        }
        CrashDetail crashDetail = (CrashDetail) obj;
        return j.b(unknownFields(), crashDetail.unknownFields()) && j.b(this.name, crashDetail.name) && j.b(this.data_, crashDetail.data_);
    }

    public final ByteString getData_() {
        return this.data_;
    }

    public final ByteString getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.data_.hashCode() + ((this.name.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m10newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        arrayList.add("data_=" + this.data_);
        return C1110A.F(arrayList, ", ", "CrashDetail{", "}", null, 56);
    }

    public /* synthetic */ CrashDetail(ByteString byteString, ByteString byteString2, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? ByteString.EMPTY : byteString3);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m10newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashDetail(ByteString name, ByteString data_, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(name, "name");
        j.g(data_, "data_");
        j.g(unknownFields, "unknownFields");
        this.name = name;
        this.data_ = data_;
    }
}
