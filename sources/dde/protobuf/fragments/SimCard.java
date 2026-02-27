package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.Z;
import dg.a0;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class SimCard extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String carrierIso;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String operatorName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String type;
    public static final a0 Companion = new a0();
    public static final ProtoAdapter<SimCard> ADAPTER = new Z(FieldEncoding.LENGTH_DELIMITED, z.a(SimCard.class), "type.googleapis.com/dde.protobuf.fragments.SimCard", Syntax.PROTO_3, null, "dde-protobuf/fragments/SimCard.proto");

    public SimCard() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SimCard copy$default(SimCard simCard, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simCard.type;
        }
        if ((i & 2) != 0) {
            str2 = simCard.carrierIso;
        }
        if ((i & 4) != 0) {
            str3 = simCard.operatorName;
        }
        if ((i & 8) != 0) {
            byteString = simCard.unknownFields();
        }
        return simCard.copy(str, str2, str3, byteString);
    }

    public final SimCard copy(String str, String str2, String str3, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new SimCard(str, str2, str3, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimCard)) {
            return false;
        }
        SimCard simCard = (SimCard) obj;
        return j.b(unknownFields(), simCard.unknownFields()) && j.b(this.type, simCard.type) && j.b(this.carrierIso, simCard.carrierIso) && j.b(this.operatorName, simCard.operatorName);
    }

    public final String getCarrierIso() {
        return this.carrierIso;
    }

    public final String getOperatorName() {
        return this.operatorName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.carrierIso;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.operatorName;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m251newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.type != null) {
            AbstractC1414e.p(this.type, new StringBuilder("type="), arrayList);
        }
        if (this.carrierIso != null) {
            AbstractC1414e.p(this.carrierIso, new StringBuilder("carrierIso="), arrayList);
        }
        if (this.operatorName != null) {
            AbstractC1414e.p(this.operatorName, new StringBuilder("operatorName="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "SimCard{", "}", null, 56);
    }

    public /* synthetic */ SimCard(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m251newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimCard(String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.type = str;
        this.carrierIso = str2;
        this.operatorName = str3;
    }
}
