package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = "";
        MediaCount mediaCountDecode = null;
        CollectorDetails collectorDetailsDecode = null;
        Hardware hardwareDecode = null;
        GeneralData generalDataDecode = null;
        Location locationDecode = null;
        Bluetooth bluetoothDecode = null;
        Performance performanceDecode = null;
        int iIntValue = 0;
        String strDecode2 = strDecode;
        while (true) {
            int iNextTag = protoReader.nextTag();
            String str = strDecode2;
            if (iNextTag == -1) {
                return new Extract(strDecode, iIntValue, str, arrayListJ, mediaCountDecode, arrayList, arrayList2, arrayList3, collectorDetailsDecode, hardwareDecode, generalDataDecode, locationDecode, arrayList4, arrayList5, arrayList6, arrayList7, bluetoothDecode, arrayList8, arrayList9, performanceDecode, arrayList10, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    strDecode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    iIntValue = ProtoAdapter.UINT32.decode(protoReader).intValue();
                    break;
                case 3:
                    strDecode2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    arrayListJ.add(Media.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    mediaCountDecode = MediaCount.ADAPTER.decode(protoReader);
                    break;
                case 6:
                    arrayList.add(Contact.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    arrayList2.add(CalendarEvent.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    arrayList3.add(CalendarReminder.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    collectorDetailsDecode = CollectorDetails.ADAPTER.decode(protoReader);
                    break;
                case 10:
                    hardwareDecode = Hardware.ADAPTER.decode(protoReader);
                    break;
                case 11:
                    generalDataDecode = GeneralData.ADAPTER.decode(protoReader);
                    break;
                case 12:
                    locationDecode = Location.ADAPTER.decode(protoReader);
                    break;
                case 13:
                    arrayList4.add(InstalledApplication.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    arrayList5.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 15:
                    arrayList6.add(WifiNetwork.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    arrayList7.add(Network.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    bluetoothDecode = Bluetooth.ADAPTER.decode(protoReader);
                    break;
                case 18:
                    arrayList8.add(Sensor.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    arrayList9.add(Camera.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    performanceDecode = Performance.ADAPTER.decode(protoReader);
                    break;
                case 21:
                    arrayList10.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(iNextTag);
                    break;
            }
            strDecode2 = str;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Extract value = (Extract) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        if (!j.b(value.getSdk_version(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getSdk_version());
        }
        if (value.getProto_version() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getProto_version()));
        }
        if (!j.b(value.getExtraction_id(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getExtraction_id());
        }
        Media.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getMedias());
        MediaCount.ADAPTER.encodeWithTag(writer, 5, value.getMedia_count());
        Contact.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getContacts());
        CalendarEvent.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.getCalendar_events());
        CalendarReminder.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.getCalendar_reminders());
        CollectorDetails.ADAPTER.encodeWithTag(writer, 9, value.getCollector_details());
        Hardware.ADAPTER.encodeWithTag(writer, 10, value.getHardware());
        GeneralData.ADAPTER.encodeWithTag(writer, 11, value.getGeneral_data());
        Location.ADAPTER.encodeWithTag(writer, 12, value.getLocation());
        InstalledApplication.ADAPTER.asRepeated().encodeWithTag(writer, 13, value.getInstalled_applications());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 14, value.getDevice_fonts());
        WifiNetwork.ADAPTER.asRepeated().encodeWithTag(writer, 15, value.getWifi_networks());
        Network.ADAPTER.asRepeated().encodeWithTag(writer, 16, value.getNetwork());
        Bluetooth.ADAPTER.encodeWithTag(writer, 17, value.getBluetooth());
        Sensor.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.getSensors());
        Camera.ADAPTER.asRepeated().encodeWithTag(writer, 19, value.getCameras());
        Performance.ADAPTER.encodeWithTag(writer, 20, value.getPerformance());
        protoAdapter.asRepeated().encodeWithTag(writer, 21, value.getThreats());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Extract value = (Extract) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        if (!j.b(value.getSdk_version(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSdk_version());
        }
        if (value.getProto_version() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getProto_version()));
        }
        if (!j.b(value.getExtraction_id(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getExtraction_id());
        }
        int iEncodedSizeWithTag = InstalledApplication.ADAPTER.asRepeated().encodedSizeWithTag(13, value.getInstalled_applications()) + Location.ADAPTER.encodedSizeWithTag(12, value.getLocation()) + GeneralData.ADAPTER.encodedSizeWithTag(11, value.getGeneral_data()) + Hardware.ADAPTER.encodedSizeWithTag(10, value.getHardware()) + CollectorDetails.ADAPTER.encodedSizeWithTag(9, value.getCollector_details()) + CalendarReminder.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getCalendar_reminders()) + CalendarEvent.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getCalendar_events()) + Contact.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getContacts()) + MediaCount.ADAPTER.encodedSizeWithTag(5, value.getMedia_count()) + Media.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getMedias()) + size;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(21, value.getThreats()) + Performance.ADAPTER.encodedSizeWithTag(20, value.getPerformance()) + Camera.ADAPTER.asRepeated().encodedSizeWithTag(19, value.getCameras()) + Sensor.ADAPTER.asRepeated().encodedSizeWithTag(18, value.getSensors()) + Bluetooth.ADAPTER.encodedSizeWithTag(17, value.getBluetooth()) + Network.ADAPTER.asRepeated().encodedSizeWithTag(16, value.getNetwork()) + WifiNetwork.ADAPTER.asRepeated().encodedSizeWithTag(15, value.getWifi_networks()) + protoAdapter.asRepeated().encodedSizeWithTag(14, value.getDevice_fonts()) + iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Extract value = (Extract) obj;
        j.g(value, "value");
        List listM186redactElements = Internal.m186redactElements(value.getMedias(), Media.ADAPTER);
        MediaCount media_count = value.getMedia_count();
        MediaCount mediaCountRedact = media_count != null ? MediaCount.ADAPTER.redact(media_count) : null;
        List listM186redactElements2 = Internal.m186redactElements(value.getContacts(), Contact.ADAPTER);
        List listM186redactElements3 = Internal.m186redactElements(value.getCalendar_events(), CalendarEvent.ADAPTER);
        List listM186redactElements4 = Internal.m186redactElements(value.getCalendar_reminders(), CalendarReminder.ADAPTER);
        CollectorDetails collector_details = value.getCollector_details();
        CollectorDetails collectorDetailsRedact = collector_details != null ? CollectorDetails.ADAPTER.redact(collector_details) : null;
        Hardware hardware = value.getHardware();
        Hardware hardwareRedact = hardware != null ? Hardware.ADAPTER.redact(hardware) : null;
        GeneralData general_data = value.getGeneral_data();
        GeneralData generalDataRedact = general_data != null ? GeneralData.ADAPTER.redact(general_data) : null;
        Location location = value.getLocation();
        Location locationRedact = location != null ? Location.ADAPTER.redact(location) : null;
        List listM186redactElements5 = Internal.m186redactElements(value.getInstalled_applications(), InstalledApplication.ADAPTER);
        List listM186redactElements6 = Internal.m186redactElements(value.getWifi_networks(), WifiNetwork.ADAPTER);
        List listM186redactElements7 = Internal.m186redactElements(value.getNetwork(), Network.ADAPTER);
        Bluetooth bluetooth = value.getBluetooth();
        Bluetooth bluetoothRedact = bluetooth != null ? Bluetooth.ADAPTER.redact(bluetooth) : null;
        List listM186redactElements8 = Internal.m186redactElements(value.getSensors(), Sensor.ADAPTER);
        List listM186redactElements9 = Internal.m186redactElements(value.getCameras(), Camera.ADAPTER);
        Performance performance = value.getPerformance();
        return value.copy((3670015 & 1) != 0 ? value.sdk_version : null, (3670015 & 2) != 0 ? value.proto_version : 0, (3670015 & 4) != 0 ? value.extraction_id : null, (3670015 & 8) != 0 ? value.medias : listM186redactElements, (3670015 & 16) != 0 ? value.media_count : mediaCountRedact, (3670015 & 32) != 0 ? value.contacts : listM186redactElements2, (3670015 & 64) != 0 ? value.calendar_events : listM186redactElements3, (3670015 & 128) != 0 ? value.calendar_reminders : listM186redactElements4, (3670015 & 256) != 0 ? value.collector_details : collectorDetailsRedact, (3670015 & 512) != 0 ? value.hardware : hardwareRedact, (3670015 & 1024) != 0 ? value.general_data : generalDataRedact, (3670015 & 2048) != 0 ? value.location : locationRedact, (3670015 & 4096) != 0 ? value.installed_applications : listM186redactElements5, (3670015 & 8192) != 0 ? value.device_fonts : null, (3670015 & 16384) != 0 ? value.wifi_networks : listM186redactElements6, (3670015 & 32768) != 0 ? value.network : listM186redactElements7, (3670015 & 65536) != 0 ? value.bluetooth : bluetoothRedact, (3670015 & 131072) != 0 ? value.sensors : listM186redactElements8, (3670015 & 262144) != 0 ? value.cameras : listM186redactElements9, (3670015 & 524288) != 0 ? value.performance : performance != null ? Performance.ADAPTER.redact(performance) : null, (3670015 & 1048576) != 0 ? value.threats : null, (3670015 & 2097152) != 0 ? value.unknownFields() : ByteString.EMPTY);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Extract value = (Extract) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(writer, 21, value.getThreats());
        Performance.ADAPTER.encodeWithTag(writer, 20, value.getPerformance());
        Camera.ADAPTER.asRepeated().encodeWithTag(writer, 19, value.getCameras());
        Sensor.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.getSensors());
        Bluetooth.ADAPTER.encodeWithTag(writer, 17, value.getBluetooth());
        Network.ADAPTER.asRepeated().encodeWithTag(writer, 16, value.getNetwork());
        WifiNetwork.ADAPTER.asRepeated().encodeWithTag(writer, 15, value.getWifi_networks());
        protoAdapter.asRepeated().encodeWithTag(writer, 14, value.getDevice_fonts());
        InstalledApplication.ADAPTER.asRepeated().encodeWithTag(writer, 13, value.getInstalled_applications());
        Location.ADAPTER.encodeWithTag(writer, 12, value.getLocation());
        GeneralData.ADAPTER.encodeWithTag(writer, 11, value.getGeneral_data());
        Hardware.ADAPTER.encodeWithTag(writer, 10, value.getHardware());
        CollectorDetails.ADAPTER.encodeWithTag(writer, 9, value.getCollector_details());
        CalendarReminder.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.getCalendar_reminders());
        CalendarEvent.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.getCalendar_events());
        Contact.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getContacts());
        MediaCount.ADAPTER.encodeWithTag(writer, 5, value.getMedia_count());
        Media.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getMedias());
        if (!j.b(value.getExtraction_id(), "")) {
            protoAdapter.encodeWithTag(writer, 3, value.getExtraction_id());
        }
        if (value.getProto_version() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getProto_version()));
        }
        if (j.b(value.getSdk_version(), "")) {
            return;
        }
        protoAdapter.encodeWithTag(writer, 1, value.getSdk_version());
    }
}
