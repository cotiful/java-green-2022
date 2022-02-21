package hospital;

import java.util.List;

import hospital.HospitalDto.Response.Body.Items.Item;

public class Check {

    public static void main(String[] args) {
        List<Item> items = HospitalDownload.Download();
        System.out.println(items);
    }

}
