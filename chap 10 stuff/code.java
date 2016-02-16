 //int x = event.getX();
        // int y = event.getY();
         if (xyxy[0]==0)
         {
             xyxy[0]=event.getX();
             xyxy[1]=event.getY();
             int[] d={xyxy[0],xyxy[1],xyxy[0]+1,xyxy[1]+1};
             scene.setRectangleTo(d );
            }
         else if(xyxy[2]==0)
         {
             xyxy[2]=event.getX();
             xyxy[3]=event.getY();
             scene.setRectangleTo(xyxy);
             xyxy=new int[4];//{0,0,0,0);
            }
        //    else {
        // scene.moveRectangleTo(event.getX(), event.getY());
        //}