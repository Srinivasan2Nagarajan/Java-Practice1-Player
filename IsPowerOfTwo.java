 public boolean isPowerOfTwo(int n){

            boolean isPower=false;
            int temp=n;

            while(temp>=2){
                if(temp%2==0){
                    isPower=true;

                }else{
                    isPower=false;
                    break;
                }
                temp=temp/2;
            }

            if(isPower){
                System.out.println("power of 2");
            }else{
                System.out.println("not power of 2");
            }

            return isPower;
        }
