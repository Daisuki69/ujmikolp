package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Register extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long u64;
    public static final q0 Companion = new q0();
    public static final ProtoAdapter<Register> ADAPTER = new p0(FieldEncoding.LENGTH_DELIMITED, z.a(Register.class), "type.googleapis.com/Register", Syntax.PROTO_3, null, "tombstone.proto");

    public Register() {
        this(null, 0L, null, 7, null);
    }

    public static /* synthetic */ Register copy$default(Register register, String str, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = register.name;
        }
        if ((i & 2) != 0) {
            j = register.u64;
        }
        if ((i & 4) != 0) {
            byteString = register.unknownFields();
        }
        return register.copy(str, j, byteString);
    }

    public final Register copy(String name, long j, ByteString unknownFields) {
        j.g(name, "name");
        j.g(unknownFields, "unknownFields");
        return new Register(name, j, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Register)) {
            return false;
        }
        Register register = (Register) obj;
        return j.b(unknownFields(), register.unknownFields()) && j.b(this.name, register.name) && this.u64 == register.u64;
    }

    public final String getName() {
        return this.name;
    }

    public final long getU64() {
        return this.u64;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.name);
        long j = this.u64;
        int i4 = iC + ((int) (j ^ (j >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("u64=" + this.u64);
        return C1110A.F(arrayList, ", ", "Register{", "}", null, 56);
    }

    public /* synthetic */ Register(String str, long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Register(String name, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(name, "name");
        j.g(unknownFields, "unknownFields");
        this.name = name;
        this.u64 = j;
    }
}
