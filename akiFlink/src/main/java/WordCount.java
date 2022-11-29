import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class WordCount {
    public static void main(String[] args) throws Exception{
        ExecutionEnvironment executionEnvironment = ExecutionEnvironment.getExecutionEnvironment();
        //获取路径
        String filePath = "E:\\demo\\akiBlog2\\akiFlink\\src\\main\\resources\\hello.txt";
        DataSource<String> inputDataSet = executionEnvironment.readTextFile(filePath);
        //对数据集进行处理 把数据转换成(word,1)形式的元组
        DataSet<Tuple2<String,Integer>> sum = inputDataSet.flatMap(new myFlatMapper())
                                            .groupBy(0)//按照第一个位置的word分组
                                            .sum(1);

        sum.print();
    }
    //实现myFlatMapper
    public static class myFlatMapper implements FlatMapFunction<String, Tuple2<String,Integer>>{

        @Override
        public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {
            //按空格分词
            String words[] = s.split(" ");
            //遍历
            for(String word : words){
                collector.collect(new Tuple2<>(word,1));
            }
        }
    }
}
