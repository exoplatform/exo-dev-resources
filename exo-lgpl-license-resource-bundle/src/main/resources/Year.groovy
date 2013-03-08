import java.text.MessageFormat

static String compute() {
  return MessageFormat.format("{0,date,yyyy}", new Date())
}