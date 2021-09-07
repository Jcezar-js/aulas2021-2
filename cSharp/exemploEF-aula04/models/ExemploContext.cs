using Microsoft.EntityFrameworkCore;

namespace models{
    public class ExemploContext : DbContext{
        public DbSet<Pessoa> Pessoas { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder builder)
        {    //String de coneasasdxão com o banco de dados. 
            //local db for windows / localhost for linux
            builder.UseSqlServer(@"Server=(localdb)\mssqllocaldb;Database=exemploEF;Integrated Security=True");
        }
    }    
}