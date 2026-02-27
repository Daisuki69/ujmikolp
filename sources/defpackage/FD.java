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

/* JADX INFO: loaded from: classes3.dex */
public final class FD extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int fd;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String owner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long tag;
    public static final G Companion = new G();
    public static final ProtoAdapter<FD> ADAPTER = new F(FieldEncoding.LENGTH_DELIMITED, z.a(FD.class), "type.googleapis.com/FD", Syntax.PROTO_3, null, "tombstone.proto");

    public FD() {
        this(0, null, null, 0L, null, 31, null);
    }

    public static /* synthetic */ FD copy$default(FD fd, int i, String str, String str2, long j, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fd.fd;
        }
        if ((i4 & 2) != 0) {
            str = fd.path;
        }
        if ((i4 & 4) != 0) {
            str2 = fd.owner;
        }
        if ((i4 & 8) != 0) {
            j = fd.tag;
        }
        if ((i4 & 16) != 0) {
            byteString = fd.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return fd.copy(i, str, str3, j, byteString2);
    }

    public final FD copy(int i, String path, String owner, long j, ByteString unknownFields) {
        j.g(path, "path");
        j.g(owner, "owner");
        j.g(unknownFields, "unknownFields");
        return new FD(i, path, owner, j, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FD)) {
            return false;
        }
        FD fd = (FD) obj;
        return j.b(unknownFields(), fd.unknownFields()) && this.fd == fd.fd && j.b(this.path, fd.path) && j.b(this.owner, fd.owner) && this.tag == fd.tag;
    }

    public final int getFd() {
        return this.fd;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = AbstractC1414e.c(AbstractC1414e.c(((unknownFields().hashCode() * 37) + this.fd) * 37, 37, this.path), 37, this.owner);
        long j = this.tag;
        int i4 = iC + ((int) (j ^ (j >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m14newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("fd=" + this.fd);
        arrayList.add("path=" + Internal.sanitize(this.path));
        arrayList.add("owner=" + Internal.sanitize(this.owner));
        arrayList.add("tag=" + this.tag);
        return C1110A.F(arrayList, ", ", "FD{", "}", null, 56);
    }

    public /* synthetic */ FD(int i, String str, String str2, long j, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m14newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FD(int i, String path, String owner, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(path, "path");
        j.g(owner, "owner");
        j.g(unknownFields, "unknownFields");
        this.fd = i;
        this.path = path;
        this.owner = owner;
        this.tag = j;
    }
}
