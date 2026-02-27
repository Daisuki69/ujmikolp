package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Camera;
import dde.protobuf.fragments.ExtractionDetails;
import dde.protobuf.fragments.HardwareFragment;
import dde.protobuf.fragments.Resolution;
import dde.protobuf.fragments.Sensor;
import dde.protobuf.fragments.Volume;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1369C extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5P8"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        ExtractionDetails extractionDetailsDecode = null;
        Integer numDecode = null;
        String strDecode = null;
        Resolution resolutionDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new HardwareFragment(extractionDetailsDecode, numDecode, strDecode, resolutionDecode, numDecode2, arrayListJ, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    extractionDetailsDecode = ExtractionDetails.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    numDecode = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    resolutionDecode = Resolution.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    numDecode2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    arrayListJ.add(Camera.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList.add(Volume.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    arrayList2.add(Sensor.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        HardwareFragment hardwareFragment = (HardwareFragment) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PC"));
        kotlin.jvm.internal.j.g(hardwareFragment, numX49.tnTj78("bd5P4"));
        if (hardwareFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(protoWriter, 1, hardwareFragment.getExtractionDetails());
        }
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, hardwareFragment.getCoreCount());
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, hardwareFragment.getRamSize());
        Resolution.ADAPTER.encodeWithTag(protoWriter, 4, hardwareFragment.getScreenSize());
        protoAdapter.encodeWithTag(protoWriter, 5, hardwareFragment.getPhoneType());
        Camera.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, hardwareFragment.getCameras());
        Volume.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, hardwareFragment.getVolumes());
        Sensor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, hardwareFragment.getSensors());
        protoWriter.writeBytes(hardwareFragment.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HardwareFragment hardwareFragment = (HardwareFragment) obj;
        kotlin.jvm.internal.j.g(hardwareFragment, numX49.tnTj78("bd5Pw"));
        int size = hardwareFragment.unknownFields().size();
        if (hardwareFragment.getExtractionDetails() != null) {
            size += ExtractionDetails.ADAPTER.encodedSizeWithTag(1, hardwareFragment.getExtractionDetails());
        }
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return Sensor.ADAPTER.asRepeated().encodedSizeWithTag(8, hardwareFragment.getSensors()) + Volume.ADAPTER.asRepeated().encodedSizeWithTag(7, hardwareFragment.getVolumes()) + Camera.ADAPTER.asRepeated().encodedSizeWithTag(6, hardwareFragment.getCameras()) + protoAdapter.encodedSizeWithTag(5, hardwareFragment.getPhoneType()) + Resolution.ADAPTER.encodedSizeWithTag(4, hardwareFragment.getScreenSize()) + ProtoAdapter.STRING.encodedSizeWithTag(3, hardwareFragment.getRamSize()) + protoAdapter.encodedSizeWithTag(2, hardwareFragment.getCoreCount()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HardwareFragment hardwareFragment = (HardwareFragment) obj;
        kotlin.jvm.internal.j.g(hardwareFragment, numX49.tnTj78("bd5Pc"));
        ExtractionDetails extractionDetails = hardwareFragment.getExtractionDetails();
        ExtractionDetails extractionDetailsRedact = extractionDetails != null ? ExtractionDetails.ADAPTER.redact(extractionDetails) : null;
        Resolution screenSize = hardwareFragment.getScreenSize();
        return HardwareFragment.copy$default(hardwareFragment, extractionDetailsRedact, null, null, screenSize != null ? Resolution.ADAPTER.redact(screenSize) : null, null, Internal.m186redactElements(hardwareFragment.getCameras(), Camera.ADAPTER), Internal.m186redactElements(hardwareFragment.getVolumes(), Volume.ADAPTER), Internal.m186redactElements(hardwareFragment.getSensors(), Sensor.ADAPTER), ByteString.EMPTY, 22, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        HardwareFragment hardwareFragment = (HardwareFragment) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Po"));
        kotlin.jvm.internal.j.g(hardwareFragment, numX49.tnTj78("bd5PK"));
        reverseProtoWriter.writeBytes(hardwareFragment.unknownFields());
        Sensor.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, hardwareFragment.getSensors());
        Volume.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, hardwareFragment.getVolumes());
        Camera.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, hardwareFragment.getCameras());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, hardwareFragment.getPhoneType());
        Resolution.ADAPTER.encodeWithTag(reverseProtoWriter, 4, hardwareFragment.getScreenSize());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, hardwareFragment.getRamSize());
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, hardwareFragment.getCoreCount());
        if (hardwareFragment.getExtractionDetails() != null) {
            ExtractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, hardwareFragment.getExtractionDetails());
        }
    }
}
