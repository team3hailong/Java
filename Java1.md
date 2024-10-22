# Ngôn ngữ Java là gì
Java là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web. Ngôn ngữ này là lựa chọn phổ biến của các nhà phát triển trong hơn 2 thập niên. Hiện nay có hàng triệu ứng dụng Java đang được sử dụng. Java là một ngôn ngữ đa nền tảng, hướng đến đối tượng, lấy mạng làm trung tâm và có thể được sử dụng như một nền tảng. Đây là một ngôn ngữ lập trình nhanh, bảo mật, đáng tin cậy dùng để viết mã cho mọi thứ từ ứng dụng di động, phần mềm doanh nghiệp cho đến các ứng dụng dữ liệu lớn và công nghệ phía máy chủ.
# Lí do ra đời của Java
- Để tối ưu hóa quá trình viết mã, người ta đã nghĩ đến ý tưởng thiết kế ra 1 loại ngôn ngữ lập trình. Ngôn ngữ đó chỉ cần viết 1 lần và có thể chạy được trên nhiều môi trường khác nhau. Java ra đời để giải quyết vân đề đó.
- Các thành viên trong nhóm Green Team, đã khởi xướng dự án này để phát triển ngôn ngữ cho các thiết bị kỹ thuật số như hộp giải mã tín hiệu, tivi,... Tuy nhiên, nó phù hợp nhất cho việc lập trình internet, sau đó, Công nghệ Java được Netscape kết hợp.
# Cách Java hoạt động, điều gì xảy ra khi chạy code Java (.java)
![](https://phamanhduc.com/wp-content/uploads/2024/04/how-java-works.png)
1. Chạy file source code ngôn ngữ Java bằng trình biên dịch (compiler). Compiler sẽ kiểm tra lỗi, biên dịch sẽ hoàn tất nếu không có lỗi xảy ra.
2. Compiler tạo ra file mới, được mã hóa thành Java bytecode. Bất kì thiết bị nào có khả năng chạy Java đều có thể thông dịch (interpret) file này sang thứ gì đó mà nó có thể chạy.
3. Các thiết bị được cài đặt máy ảo Java (JVM – Java virtual machine). Khi các thiết bị chạy game, JVM sẽ đọc và chạy các file bytecode.
# Cấu trúc 1 chương trình Java
```java
public class ClassName{
  public static void main(String[] args){
    //Các câu lệnh xử lý
  }
}
```
Trong đó, các phần trong cú pháp của Java có ý nghĩa như sau:
![](https://laptrinhcanban.com/java/java-co-ban-cho-nguoi-moi-bat-dau/kien-thuc-co-ban-ve-java/cau-truc-chuong-trinh-java/cau-truc-chuong-trinh-java.png)
# Syntax cơ bản
```java
package <package_name>;

import <other_package>;

public class ClassName {
  <Variables (also known as fields)>;

  <constructor method(s)>;

  <other methods>;
}
```
Trong đó:

- **Package**: Một package (gói) mô tả không gian tên có chứa các lớp của Java, sử dụng ký tự thường và dấu chấm để định nghĩa tên, chúng ta có thể xem package như là một thư mục, còn class chính là các file trực thuộc thư mục.
- **Import**: Từ khóa được sử dụng trong Java nhằm để xác định các class hoặc các package được sử dụng trong lớp này.
- **Class**: Từ khóa nhằm để định nghĩa lớp của Java. Nó đứng trước khai báo tên lớp của Java. Ngoài ra còn có từ khóa public, từ khóa này xác định phạm vi truy cập của lớp. Đặc tính này chính là tính đóng gói trong lập trình hướng đối tượng. (chúng ta sẽ tìm hiểu phần này ở các bài sau)
- **Variables**: Biến hay còn gọi là trường, cũng có một số tài liệu gọi là thuộc tính trực thuộc lớp. Nó chứa thông tin cụ thể liên quan tới các đối tượng là thể hiện của lớp.
- **Methods**: Phương thức hay còn gọi là hàm chứa các hành động thực thi của đối tượng. Đương nhiên nội dung của phương thức chính là các đoạn mã thực thi của chính phương thức này.
- **Constructors**: Phương thức khởi tạo (Hay hàm khởi tạo) của đối tượng. Hình dạng của đối tượng được thể hiện ra sao sẽ phụ thuộc vào phương thức này.
# Khai báo biến nguyên thủy
1. Quy tắc đặt tên biến
- Đặt tên theo quy tắc Camelcase: Viết chữ cái đầu tiên của tên biến bằng chữ thường và chữ cái đầu tiên của các từ tiếp theo bằng chữ hoa. Ví dụ, studentNumber …
- Ghi tên kiểu dữ liệu vào tên biến. Ví dụ: studentList cho kiểu List, studentArray cho kiểu Mảng …
2. Các kiểu dữ liệu nguyên thuỷ
![](https://images.viblo.asia/d17c8953-c0fa-4d1c-9434-f8e18078a114.jpg)
4. Khai báo biến nguyên thuỷ
- Trong Java, khai báo biến nguyên thủy (primitive data types) được thực hiện bằng cách chỉ định kiểu dữ liệu, sau đó là tên biến. Ví dụ:

> - int age;: Khai báo biến age kiểu số nguyên (integer) và gán giá trị 30 cho nó.
> - long bigNumber = 1234567890123456789L;: Khai báo biến bigNumber kiểu số nguyên long (64 bit), lưu ý ký tự L ở cuối giá trị.
> - float singlePrecision = 3.14f;: Khai báo biến singlePrecision kiểu số thực float (single-precision floating-point number), lưu ý ký tự f ở cuối giá trị.
- Những dòng code trên đều khai báo và khởi tạo biến cùng một lúc. Bạn cũng có thể khai báo biến mà không khởi tạo giá trị ban đầu, nhưng cần gán giá trị cho nó trước khi sử dụng:

- Lưu ý rằng, việc khai báo nhiều biến cùng kiểu dữ liệu có thể được thực hiện trên cùng một dòng, cách nhau bởi dấu phẩy:
int x = 10, y = 20, z = 30;
# Làm quen với vòng lặp
**Lưu ý**: Thực ra trong Java có thể khai báo mảng theo 2 cách sau: int[] a hoặc int a[]. Chức năng đều như nhau, nên các bạn có thể cách nào tùy ý. Tuy nhiên, do người ta thường khuyên viết cách đầu hơn nên Kteam quyết định viết bài theo cách đó.
## Vòng lặp for
```java
for (khởi tạo; điều kiện; cập nhật) {
    // code thực thi trong vòng lặp
}
```
## Vòng lặp while
```java
while (điều_kiện) {
    // Mã thực thi trong vòng lặp
}
```
# Câu lệnh rẽ nhánh
```java
if (<Biểu thức điều kiện 1>)

<Câu lệnh thực hiện điều kiện 1>

else if (<Biểu thức điều kiện 2>)

<Câu lệnh thực hiện điều kiện 2>

(Nhiều câu điều kiện khác nếu cần)

else

<Câu lệnh thực hiện không đúng trong tất các điều kiện trên>
```
# Mảng trong Java
## Mảng 1 chiều
Cú pháp khai báo:

> <kiểu dữ liệu> [] <tên mảng>;


Cú pháp cấp phát bộ nhớ để tạo mảng:

> <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];

Cú pháp rút gọn hơn:

> <kiểu dữ liệu> [] <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];

Ví dụ
```java
public class HelloWorld{

     public static void main(String []args){
        int[] a;
        a = new int[3];
        a[0] = 5;
        a[1] = 2;
        a[2] = 1;
        System.out.println(a);
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
     }
}
```
## Mảng đa chiều
Cú pháp khai báo:

> <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu>[kích cỡ hàng] [kích cỡ cột];


Cú pháp khởi tạo cho mảng:

> <kiểu dữ liệu> [][] <tên mảng> = {{các giá trị hàng 1}, {các giá trị hàng 2},… {các giá trị hàng n}}

Ví dụ
```java
public class HelloWorld{

     public static void main(String []args){
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
     }
}
```
# Tổng quan về Class và Object
![](https://funix.edu.vn/wp-content/uploads/2022/03/external-content-duckduckgo-com-16331547209891134749158-0-0-942-1676-crop-1633154954083874831395-1024x576.jpg)
## Class
Trong Java, một lớp là một thực thể xác định hành vi mà một đối tượng có và sẽ có. Nói cách khác, một lớp chỉ là một bản thiết kế hoặc một tập hợp các hướng dẫn để xây dựng các đặc tính của một đối tượng cụ thể sau này. Cách tạo lớp trong Java như sau:
```java
class <class_name> {
    field;
    method;
}
```
Trong đó:
- class: từ khóa để tạo một class
- <class_name>: tên class bạn định tạo nó sẽ được viết liền và viết HOA chữ cái đầu tiên của từng từ (quy tắc PascalCase)
- field: biến đối tượng
- method: phương thức
## Object 
Một Object có thể chứa các thành phần như các phương thức (method) và thuộc tính (thuộc tính) để tạo ra các kiểu dữ liệu hữu ích. Đối tượng xác định hành vi của lớp. Khi bạn gửi tin nhắn đến một đối tượng, bạn bắt buộc phải gọi đối tượng hoặc thực hiện một trong các phương thức của nó. 

Từ quan điểm của lập trình hướng đối tượng, các đối tượng có thể là cấu trúc dữ liệu, biến hoặc hàm. Đối tượng là vị trí bộ nhớ được cấp phát. Các đối tượng được thiết kế dưới dạng các lớp phân cấp. Cách tạo đối tượng trong Java như sau:

> <class_name> ReferenceVariable = new <class_name>();

Trong đó:

- <class_name>: kiểu dữ liệu của đối tượng
- ReferenceVariable: tên tham chiếu của đối tượng
- new: từ khóa dùng tạo đối tượng
- <class_name>(): class dùng để tạo bạn đối tượng
## Sự khác biệt giữa lớp và đối tượng (Class và Object)

| STT | Lớp (Class)                                                   | Đối tượng (Object)                                              |
|-----|---------------------------------------------------------------|-----------------------------------------------------------------|
| 1   | Là bản thiết kế hoặc khuôn mẫu mà từ đó đối tượng được tạo ra | Là một thể hiện của lớp                                         |
| 2   | Là tập hợp những đối tượng có thuộc tính giống nhau           | Là một thực thể trong thế giới thực như bút, máy tính, giường,… |
| 3   | Một lớp chỉ được khai báo một lần                             | Một đối tượng được khai báo nhiều lần theo yêu cầu              |
| 4   | Lớp được khai báo với từ khóa “class”                         | Đối tượng được khai báo với từ khóa “new” hoặc tên lớp          |
| 5   | Lớp không được cấp phát bộ nhớ khi được tạo                   | Đối tượng được phân bộ nhớ mỗi khi khởi tạo                     |
| 6   | Lớp là một thực thể logic                                     | Đối tượng là một thực thể vật lý                                |
| VD  | Human Car Fruit                                               | Man, Woman BMW, Toyota,… Apple, Orange,…                        |

# Từ khóa this, constructor, access modifier, getter, setter, từ khóa static
- *this*: Từ khóa this dùng để tham chiếu đến đối tượng hiện tại đang được thao tác. Trong một phương thức của lớp, this trỏ đến instance (thể hiện) cụ thể của lớp đó mà phương thức đang được gọi. Nó rất hữu ích khi cần phân biệt giữa biến thành viên của lớp và biến cục bộ trong một phương thức.

- Constructor (Hàm tạo): Constructor là một phương thức đặc biệt trong một lớp, có tên giống với tên lớp và không có kiểu trả về (không có void hay kiểu dữ liệu khác). Nó được tự động gọi khi một đối tượng mới của lớp được tạo ra. Constructor được dùng để khởi tạo các biến thành viên của đối tượng.

- Access Modifier (Bộ sửa đổi truy cập): Access modifier là các từ khóa xác định mức độ truy cập vào các thành viên (biến và phương thức) của một lớp. Các access modifier phổ biến bao gồm:

> - *public*: Truy cập được từ bất kỳ đâu.
> - *private*: Chỉ truy cập được từ bên trong lớp.
> - *protected*: Truy cập được từ bên trong lớp và từ các lớp con (derived classes).
> - *default* (không có access modifier): Chỉ truy cập được từ bên trong cùng một package (gói) trong Java.

- Getter: Getter là một phương thức được dùng để truy xuất giá trị của một biến thành viên riêng tư (private). Việc sử dụng getter giúp đảm bảo tính đóng gói (encapsulation) của dữ liệu, cho phép kiểm soát việc truy cập vào biến thành viên.

- Setter: Setter là một phương thức được dùng để thiết lập (gán giá trị) cho một biến thành viên riêng tư (private). Tương tự như getter, setter cũng giúp đảm bảo tính đóng gói và cho phép thực hiện các kiểm tra xác thực giá trị trước khi gán vào biến thành viên.

- *static*: Từ khóa static chỉ ra rằng một thành viên của lớp (biến hoặc phương thức) thuộc về chính lớp chứ không thuộc về bất kỳ instance nào của lớp đó. Có nghĩa là chỉ có một bản sao duy nhất của thành viên static cho toàn bộ lớp, bất kể có bao nhiêu đối tượng của lớp được tạo ra. Ví dụ, biến đếm số lượng đối tượng của một lớp thường được khai báo là static.
