public class practice_4_3 {
    public static void main(String[] args) {
        int count = 1;
        int num = 0;
        int[][] map =
                    {{1, 1, 1,1},
                    {1, 0, 0, 1},
                    {1, 1, 0, 0},
                    {1, 1, 1, 1}};
        int yunmi_x = 1;
        int yunmi_y = 1;
        int seen_direc = 0;
        int see_x = 0;
        int see_y = 0;
        int isOcean = 0;
        int nextseen = 0;
        map[yunmi_y][yunmi_x]=1;
        while (true) {
            if (seen_direc == 1) {//동쪽을 향할때
                //가서 검색해야하는 좌표 =북쪽좌표
                see_x = yunmi_x;
                see_y = yunmi_y - 1;
                nextseen = 0;
                num++;

            } else if (seen_direc == 2) {//남
                //동
                see_x = yunmi_x + 1;
                see_y = yunmi_y;
                nextseen = 1;
                num++;

            } else if (seen_direc == 3) {//서
                //남
                see_x = yunmi_x;
                see_y = yunmi_y + 1;
                nextseen = 2;
                num++;
            } else {//북
                //서
                see_x = yunmi_x - 1;
                see_y = yunmi_y;
                nextseen = 3;
                num++;
            }
            System.out.println("seey: "+see_y+"seex: "+see_x);
            if(see_y<0||see_x<0||see_x>3||see_y>3){break;}
            isOcean = map[see_y][see_x];
            if (isOcean == 0) {
                yunmi_x = see_x;
                yunmi_y = see_y;
                map[yunmi_y][yunmi_x] = 1;
                seen_direc = nextseen;
                count++;
//                System.out.println(count);
                num = 0;
            } else {
                if (seen_direc == 3) {
                    seen_direc = 0;
                } else {
                    seen_direc = seen_direc + 1;
                }

            }
            if (num == 4) {
                break;
            }
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; j++) {
//                    if (map[i][j] != 0) {
//                        break;
//                    }
//
//                }
//        System.out.println(count);
        }
        System.out.println(count);
    }
}
