//package GreedyAlogrithm;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//
//class FoodItems{
//    String food;
//    String cuisne;
//    int rating;
//
//    FoodItems(String food,String cuisne,int rating){
//        this.food=food;
//        this.cuisne=cuisne;
//        this.rating=rating;
//    }
//}
//
//class FoodRatings {
//    ArrayList<FoodItems> mlist=new ArrayList<>();
//
//    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
//        for(int i=0;i<food.length;i++){
//            mlist.add(new FoodItems(foods[i],cuisines[i],ratings[i]));
//        }
//    }
//
//    public void changeRating(String food, int newRating) {
//        for(int i=0;i<mlist.size();i++){
//            if(mlist.get(i).food.equals(food)){
//                mlist.get(i).rating=newRating;
//            }
//        }
//    }
//
//    public String highestRated(String cuisine) {
//        int max=Integer.MIN_VALUE;
//        HashMap<String,Integer> maxRated=new HashMap<>();
//
////        for(int i=0;i<mlist.size();i++){
////
////            if(mlist.get(i).cuisne.equals(cuisine)){
////
////                String check=mlist.get(i).food;
////
////                maxRated.put(mlist.get(i).food,
////                        Math.max(maxRated.getOrDefault(mlist.get(i).food,0),check));
////            }
////        }
//
////        maxRated.get(cuisine)
//
//
//    }
//}
//public class FoodSystem {
//
//}
