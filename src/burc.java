import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        int day, month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = inp.nextInt();

        if(month == 1)
            if(day <= 21) {
                System.out.println("Oğlak burcusunuz.");}
            else if(day > 21){
                System.out.println("Kova burcusunuz.");}


        if(month == 2)
            if(day <= 19) {
                System.out.println("Kova burcusunuz.");}
            else if(day > 19){
                System.out.println("Balık burcusunuz.");}


        if(month == 3)
            if(day <= 20) {
                System.out.println("Balık burcusunuz.");}
            else if(day > 20){
                System.out.println("Koç burcusunuz.");}


        if(month == 4)
            if(day <= 20) {
                System.out.println("Koç burcusunuz.");}
            else if(day > 20){
                System.out.println("Boğa burcusunuz.");}


        if(month == 5)
            if(day <= 21) {
                System.out.println("Boğa burcusunuz.");}
            else if(day > 21){
                System.out.println("İkizler burcusunuz.");}


        if(month == 6)
            if(day <= 22) {
                System.out.println("İkizler burcusunuz.");}
            else if(day > 22){
                System.out.println("Yengeç burcusunuz.");}


        if(month == 7)
            if(day <= 22) {
                System.out.println("İkizler burcusunuz.");}
            else if(day > 22){
                System.out.println("Aslan burcusunuz.");}


        if(month == 8)
            if(day <= 22) {
                System.out.println("Aslan burcusunuz.");}
            else if(day > 22){
                System.out.println("Başak burcusunuz.");}


        if(month == 9)
            if(day <= 22) {
                System.out.println("Başak burcusunuz.");}
            else if(day > 22){
                System.out.println("Terazi burcusunuz.");}


        if(month == 10)
            if(day <= 22) {
                System.out.println("Terazi burcusunuz.");}
            else if(day > 22){
                System.out.println("Akrep burcusunuz.");}


        if(month == 11)
            if(day <= 21) {
                System.out.println("Akrep burcusunuz.");}
            else if(day > 21){
                System.out.println("Yay burcusunuz.");}


        if(month == 12)
            if(day <= 21) {
                System.out.println("Yay burcusunuz.");}
            else if(day > 22){
                System.out.println("Oğlak burcusunuz.");}

        }
    }

